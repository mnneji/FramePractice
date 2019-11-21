package com.example.dell.framepratice.activity;

import android.view.View;

import com.example.dell.framepratice.R;
import com.example.dell.framepratice.base.BaseDataBindActivity;
import com.example.dell.framepratice.databinding.ActivityMainBinding;


public class MainActivity extends BaseDataBindActivity<ActivityMainBinding> {

    @Override
    public int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        super.initView();
    }

    @Override
    public void initData() {
        super.initData();
    }

    @Override
    public void initListener() {
        super.initListener();
        binding.btnAirQuality.setOnClickListener(v -> {
            AirQualityActivity.actionStart(this);
        });

        binding.btnImgDownload.setOnClickListener(v -> {
            DownloadImageActivity.actionStart(this);
        });

        binding.btnCache.setOnClickListener(v -> {
            CacheActivity.actionStart(this);
        });

        binding.btnDoc.setOnClickListener(v -> {
            DocViewActivity.actionStart(this);
        });
    }

}
