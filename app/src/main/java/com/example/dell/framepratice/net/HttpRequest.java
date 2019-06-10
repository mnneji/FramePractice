package com.example.dell.framepratice.net;

import com.example.dell.framepratice.bean.IPBean;
import com.example.dell.framepratice.net.netListener.CallBackLis;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;

public class HttpRequest {

    /**
     * 获取城市空气质量
     * @param ip
     * @param callBackLis
     */
    public static void getIpAddress(String ip, CallBackLis<IPBean> callBackLis) {
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("ip", ip);
        Observable<IPBean> observable = RetrofitHelper.getInstance().getAirQuanlity(paraMap);
        HttpCall.doCall(observable, callBackLis);
    }

}
