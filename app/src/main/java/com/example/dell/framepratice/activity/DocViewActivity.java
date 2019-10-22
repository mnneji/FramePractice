package com.example.dell.framepratice.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dell.framepratice.R;
import com.example.dell.framepratice.base.BaseDataBindActivity;
import com.example.dell.framepratice.databinding.ActivityDocViewBinding;
import com.example.dell.framepratice.net.Download.DownloadRetrofitHelper;
import com.example.dell.framepratice.net.Download.FileCallBackLis;
import com.example.dell.framepratice.utils.DocPreviewUtil;
import com.example.dell.framepratice.utils.ToastUtil;
import com.tbruyelle.rxpermissions2.RxPermissions;

import java.io.File;

import io.reactivex.functions.Consumer;

public class DocViewActivity extends BaseDataBindActivity<ActivityDocViewBinding> {
    String docUrl = "https://doc.guandang.net/word/b93ab6e40adc4a8e2e89e0be1-1.doc";
    String fileName = "University.doc";

    @Override
    public int getLayoutID() {
        return R.layout.activity_doc_view;
    }

    @SuppressLint("CheckResult")
    @Override
    public void initListener() {
        super.initListener();
        binding.btnDownload.setOnClickListener(v -> {
            File file = new File(Environment.getExternalStorageDirectory(), fileName);
            if (file.exists()) {
                ToastUtil.showToast("文件已存在");
            } else {
                RxPermissions rxPermissions = new RxPermissions(this);
                rxPermissions.request(Manifest.permission.WRITE_EXTERNAL_STORAGE).subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean granted) throws Exception {
                        if (granted) {
                            DownloadRetrofitHelper.getInstance().downloadFile(docUrl, Environment.getExternalStorageDirectory().getAbsolutePath() +
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
                        } else {
                            ToastUtil.showToast("You denied the permission");
                        }
                    }
                });
            }
        });

        binding.btnView.setOnClickListener(v -> {
            File file = new File(Environment.getExternalStorageDirectory(), fileName);
            if (file.exists()) {
                DocPreviewUtil.openFile(this, file);
            } else {
                ToastUtil.showToast("文件不存在");
            }
        });
    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, DocViewActivity.class);
        context.startActivity(intent);
    }
}
