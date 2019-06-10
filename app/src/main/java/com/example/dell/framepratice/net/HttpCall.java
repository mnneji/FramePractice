package com.example.dell.framepratice.net;


import com.example.dell.framepratice.net.netListener.CallBackLis;
import com.example.dell.framepratice.utils.RxExceptionUtil;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class HttpCall {

    /**
     * 网络请求统一封装
     *
     * @param observable
     * @param callBackLis 网络请求回调
     * @param <T>
     */
    public static <T> void doCall(Observable<T> observable, final CallBackLis<T> callBackLis) {
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<T>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(T result) {
                        if (result != null) {
                            callBackLis.onSuccess(result);
                        } else {
                            callBackLis.onFailure("请求数据异常！");
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        callBackLis.onFailure(RxExceptionUtil.exceptionHandler(e));
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
