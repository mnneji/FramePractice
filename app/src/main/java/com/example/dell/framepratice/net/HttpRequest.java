package com.example.dell.framepratice.net;

import com.example.dell.framepratice.model.AirBean;
import com.example.dell.framepratice.net.netListener.CallBackLis;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;

public class HttpRequest {

    /**
     * 获取城市空气质量
     * @param city
     * @param callBackLis
     */
    public static void getIpAddress(String city, CallBackLis<AirBean> callBackLis) {
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("city", city);
        paraMap.put("key", "31f21e0443c1e110184c84d160124eaf");
        Observable<AirBean> observable = RetrofitHelper.getInstance().getAirQuanlity(paraMap);
        HttpCall.doCall(observable, callBackLis);
    }

}
