package com.example.dell.framepratice.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.dell.framepratice.R;
import com.example.dell.framepratice.bean.AirBean;
import com.example.dell.framepratice.net.HttpRequest;
import com.example.dell.framepratice.net.netListener.CallBackLis;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends RxAppCompatActivity {

    @BindView(R.id.et_city)
    EditText etCity;
    @BindView(R.id.btn_air)
    Button btnAir;
    @BindView(R.id.tv_air)
    TextView tvAir;
    @BindView(R.id.pb)
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_air)
    public void onViewClicked() {
        pb.setVisibility(View.VISIBLE);
        HttpRequest.getIpAddress(etCity.getText().toString(), new CallBackLis<AirBean>() {
            @Override
            public void onSuccess(AirBean result) {
                pb.setVisibility(View.GONE);
                tvAir.setText(result.getResult().get(0).getCitynow().toString());
            }

            @Override
            public void onFailure(String error) {
                pb.setVisibility(View.GONE);
                tvAir.setText(error);
            }
        });
    }
}
