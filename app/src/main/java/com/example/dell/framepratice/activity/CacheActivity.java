package com.example.dell.framepratice.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import com.example.dell.framepratice.R;
import com.example.dell.framepratice.base.BaseDataBindActivity;
import com.example.dell.framepratice.databinding.ActivityCacheBinding;
import com.example.dell.framepratice.net.Download.DownloadRetrofitHelper;
import com.example.dell.framepratice.net.Download.FileCallBackLis;
import com.example.dell.framepratice.utils.CacheUtil;
import com.example.dell.framepratice.utils.ToastUtil;
import com.tbruyelle.rxpermissions2.RxPermissions;

import java.io.File;

import io.reactivex.functions.Consumer;

public class CacheActivity extends BaseDataBindActivity<ActivityCacheBinding> {

    @Override
    public int getLayoutID() {
        return R.layout.activity_cache;
    }

    @Override
    public void initListener() {
        super.initListener();
        binding.btnCache.setOnClickListener(v -> {
            if (TextUtils.isEmpty(binding.etContent.getText().toString())) {
                ToastUtil.showToast("请输入内容");
            } else {
                CacheUtil.setContent(binding.etContent.getText().toString());
            }
        });

        binding.btnShow.setOnClickListener(v -> {
            String content = CacheUtil.getContent();
            if (TextUtils.isEmpty(content)) {
                ToastUtil.showToast("请先缓存内容");
            } else {
                binding.tvContent.setText(content);
            }
        });
    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, CacheActivity.class);
        context.startActivity(intent);
    }
}
