package com.example.dell.framepratice.net.Download;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface DownloadApi {

    @Streaming
    @GET
    Call<ResponseBody> downloadWithUrl(@Url String fileUrl);
}
