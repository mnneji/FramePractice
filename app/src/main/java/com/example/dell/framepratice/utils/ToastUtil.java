package com.example.dell.framepratice.utils;

import android.widget.Toast;

/**
 * Toast帮助类
 */
public class ToastUtil {
    private static Toast toast;

    public static void showToast(String content) {
        if (toast == null) {
            toast = Toast.makeText(ContextUtil.getContext(),
                    content,
                    Toast.LENGTH_SHORT);
        } else {
            toast.setText(content);
        }
        toast.show();
    }
}
