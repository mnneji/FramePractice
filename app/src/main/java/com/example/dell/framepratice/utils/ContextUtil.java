package com.example.dell.framepratice.utils;

import android.app.Application;
import android.content.Context;

/**
 * 获取Context帮助类
 */
public class ContextUtil extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
