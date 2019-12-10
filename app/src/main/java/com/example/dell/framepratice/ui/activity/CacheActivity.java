package com.example.dell.framepratice.ui.activity;

import android.content.Context;
import android.content.Intent;

import android.text.TextUtils;

import com.example.dell.framepratice.R;
import com.example.dell.framepratice.base.BaseDataBindActivity;
import com.example.dell.framepratice.databinding.ActivityCacheBinding;
import com.example.dell.framepratice.utils.CacheUtil;
import com.example.dell.framepratice.utils.ToastUtil;

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
