package com.example.dell.framepratice.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;

import com.example.dell.framepratice.R;
import com.example.dell.framepratice.base.BaseDataBindActivity;
import com.example.dell.framepratice.databinding.ActivityAirQualityBinding;
import com.example.dell.framepratice.model.AirBean;
import com.example.dell.framepratice.net.HttpRequest;
import com.example.dell.framepratice.net.netListener.CallBackLis;

public class AirQualityActivity extends BaseDataBindActivity<ActivityAirQualityBinding> {

    @Override
    public int getLayoutID() {
        return R.layout.activity_air_quality;
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

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, AirQualityActivity.class);
        context.startActivity(intent);
    }
}
