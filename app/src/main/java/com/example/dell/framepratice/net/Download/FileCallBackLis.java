package com.example.dell.framepratice.net.Download;

public interface FileCallBackLis {

    void onSuccess(String info);

    void onFailure(String error);

    void onProgress(int progress);
}
