package com.example.dell.framepratice.net;

import com.example.dell.framepratice.net.httpApi.ApiUrl;
import com.example.dell.framepratice.Constanse;
import com.example.dell.framepratice.LogInterceptor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Retrofit封装
 */
public class RetrofitHelper {
    private static final String TAG = "RetrofitHelper";
    private static volatile ApiUrl instance = null;
    /**
     * 单例模式
     */
    public static ApiUrl getInstance() {
        if (instance == null) {
            synchronized (ApiUrl.class) {
                if (instance == null) {
                    instance = RetrofitHelper.getApiUrl();
                }
            }
        }
        return instance;
    }

    /**
     * 构造函数
     */
    private RetrofitHelper() {}

    private static ApiUrl getApiUrl() {
        ApiUrl apiUrl = initRetrofit(initOkHttp()).create(ApiUrl.class);
        return apiUrl;
    }

    /**
     * 初始化Retrofit
     */
    private static Retrofit initRetrofit(OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl(Constanse.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(initOkHttp())
                .build();
    }

    /**
     * 初始化OkHttp
     */
    private static OkHttpClient initOkHttp() {
        return new OkHttpClient().newBuilder()
                .connectTimeout(Constanse.DEFAULT_TIME, TimeUnit.SECONDS)// 设置请求超时时间
                .writeTimeout(Constanse.DEFAULT_TIME, TimeUnit.SECONDS)// 设置写入超时时间
                .readTimeout(Constanse.DEFAULT_TIME, TimeUnit.SECONDS)// 设置读取超时时间
                .addInterceptor(new LogInterceptor())// 添加打印拦截器
                .retryOnConnectionFailure(true)// 设置出现错误时进行重新连接
                .build();
    }
}
