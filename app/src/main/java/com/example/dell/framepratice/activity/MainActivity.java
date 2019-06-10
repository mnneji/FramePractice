package com.example.dell.framepratice.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.dell.framepratice.R;
import com.example.dell.framepratice.bean.IPBean;
import com.example.dell.framepratice.net.HttpRequest;
import com.example.dell.framepratice.net.netListener.CallBackLis;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends RxAppCompatActivity {

    @BindView(R.id.et_ip)
    EditText etIp;
    @BindView(R.id.btn_ip)
    Button btnIp;
    @BindView(R.id.tv_ip)
    TextView tvIp;
    @BindView(R.id.pb)
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_ip)
    public void onViewClicked() {
        pb.setVisibility(View.VISIBLE);
        HttpRequest.getIpAddress(etIp.getText().toString(), new CallBackLis<IPBean>() {
            @Override
            public void onSuccess(IPBean result) {
                pb.setVisibility(View.GONE);
                tvIp.setText(result.getData().getCity());
            }

            @Override
            public void onFailure(String error) {
                pb.setVisibility(View.GONE);
                tvIp.setText(error);
            }
        });
    }
}
