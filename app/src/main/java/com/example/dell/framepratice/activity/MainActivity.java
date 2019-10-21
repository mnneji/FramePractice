package com.example.dell.framepratice.activity;

import android.view.View;

import com.example.dell.framepratice.R;
import com.example.dell.framepratice.base.BaseDataBindActivity;
import com.example.dell.framepratice.databinding.ActivityMainBinding;
import com.example.dell.framepratice.model.AirBean;
import com.example.dell.framepratice.net.HttpRequest;
import com.example.dell.framepratice.net.netListener.CallBackLis;


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
        binding.btnAir.setOnClickListener(v -> {
            binding.pb.setVisibility(View.VISIBLE);
            HttpRequest.getIpAddress(binding.etCity.getText().toString(), new CallBackLis<AirBean>() {
                @Override
                public void onSuccess(AirBean result) {
                    binding.pb.setVisibility(View.GONE);
                    binding.tvAir.setText(result.getResult().get(0).getCitynow().toString());
                }

                @Override
                public void onFailure(String error) {
                    binding.pb.setVisibility(View.GONE);
                    binding.tvAir.setText(error);
                }
            });
        });
    }
}
