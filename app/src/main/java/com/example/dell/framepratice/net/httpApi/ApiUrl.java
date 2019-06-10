package com.example.dell.framepratice.net.httpApi;

import com.example.dell.framepratice.bean.AirBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ApiUrl {
    @GET("cityair")
    Observable<AirBean> getAirQuanlity(@QueryMap Map<String, String> paraMap);
}
