package com.example.dell.framepratice.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dell.framepratice.R;
import com.example.dell.framepratice.base.BaseDataBindActivity;
import com.example.dell.framepratice.databinding.ActivityDownloadImageBinding;
import com.example.dell.framepratice.net.Download.DownloadRetrofitHelper;
import com.example.dell.framepratice.net.Download.FileCallBackLis;
import com.example.dell.framepratice.utils.ToastUtil;
import com.example.dell.framepratice.utils.UriUtil;
import com.tbruyelle.rxpermissions2.RxPermissions;

import java.io.File;
import java.net.URI;

import io.reactivex.functions.Consumer;

public class DownloadImageActivity extends BaseDataBindActivity<ActivityDownloadImageBinding> {
    String url = "https://img.nga.178.com/attachments/mon_201910/15/-mxadxQ5-b1ybZnT1kS5i-ci.png";
    String fileName = "Minfilia.png";

    @Override
    public int getLayoutID() {
        return R.layout.activity_download_image;
    }

    @SuppressLint("CheckResult")
    @Override
    public void initListener() {
        super.initListener();
        binding.btnDownload.setOnClickListener(v -> {
            RxPermissions rxPermissions = new RxPermissions(this);
            rxPermissions.request(Manifest.permission.WRITE_EXTERNAL_STORAGE).subscribe(new Consumer<Boolean>() {
                @Override
                public void accept(Boolean granted) throws Exception {
                    if (granted) {
                        File file = new File(Environment.getExternalStorageDirectory(), fileName);
                        if (file.exists()) {
                            ToastUtil.showToast("文件已存在");
                        } else {
                            DownloadRetrofitHelper.getInstance().downloadFile(url, Environment.getExternalStorageDirectory().getAbsolutePath() +
                                    File.separator + fileName, new FileCallBackLis() {
                                @Override
                                public void onSuccess(String info) {
                                    ToastUtil.showToast("下载成功");
                                }

                                @Override
                                public void onFailure(String error) {
                                    ToastUtil.showToast("下载失败");
                                }

                                @Override
                                public void onProgress(int progress) {

                                }
                            });
                        }
                    } else {
                        ToastUtil.showToast("You denied the permission");
                    }
                }
            });
        });

        binding.btnShow.setOnClickListener(v -> {
            File file = new File(Environment.getExternalStorageDirectory(), fileName);
            if (!file.exists()) {
                ToastUtil.showToast("文件不存在");
            } else {
                binding.ivShow.setImageURI(UriUtil.getFileUri(this, file));
            }
        });
    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, DownloadImageActivity.class);
        context.startActivity(intent);
    }
}
