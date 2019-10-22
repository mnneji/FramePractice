package com.example.dell.framepratice.utils;


public class CacheUtil {
    private static final String KEY = "content";

    public static void setContent(String content) {
        PrefUtil.setString(ContextUtil.getContext(), KEY, content);
    }

    public static String getContent() {
        String content = PrefUtil.getString(ContextUtil.getContext(), KEY, "");
        return content;
    }
}
