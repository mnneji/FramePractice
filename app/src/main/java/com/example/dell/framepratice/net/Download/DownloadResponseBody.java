package com.example.dell.framepratice.net.Download;

import android.os.Handler;
import android.os.Looper;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

public class DownloadResponseBody extends ResponseBody {

    private ResponseBody responseBody;
    private BufferedSource bufferedSource;
    private FileCallBackLis callBackLis;

    public DownloadResponseBody(ResponseBody responseBody, FileCallBackLis callBackLis) {
        this.responseBody = responseBody;
        this.callBackLis = callBackLis;
    }

    @Override
    public MediaType contentType() {
        return responseBody.contentType();
    }

    @Override
    public long contentLength() {
        return responseBody.contentLength();
    }

    @Override
    public BufferedSource source() {
        if (bufferedSource == null) {
            bufferedSource = Okio.buffer(source(responseBody.source()));
        }
        return bufferedSource;
    }

    private Source source(BufferedSource source) {
        return new ForwardingSource(source) {

            long totalBytesRead = 0L;

            @Override
            public long read(Buffer sink, long byteCount) throws IOException {
                long bytesRead = super.read(sink, byteCount);
                totalBytesRead += (bytesRead != -1 ? bytesRead : 0);
                int progress = 1;
                if (responseBody.contentLength() != 0) {
                    progress = (int) (totalBytesRead * 100 / responseBody.contentLength());
                }
//                final int progress = (int) (totalBytesRead * 100 / responseBody.contentLength());
                if (callBackLis != null) {
                    //回调分发到主线程
                    int finalProgress = progress;
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {
                            callBackLis.onProgress(finalProgress);
                        }
                    });
                }
                return bytesRead;
            }
        };
    }
}
