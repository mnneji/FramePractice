package com.example.dell.framepratice.net.netListener;

/**
 * 网络请求回调监听
 * @param <T>
 */
public interface CallBackLis<T> {

    void onSuccess(T result);

    void onFailure(String error);

}
