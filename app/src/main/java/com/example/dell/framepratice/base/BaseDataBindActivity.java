package com.example.dell.framepratice.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

public abstract class BaseDataBindActivity<T extends ViewDataBinding> extends RxAppCompatActivity {

    public T binding;

    public abstract int getLayoutID();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, getLayoutID());

        //不是抽象方法，不强制子类重写，子类按需求选择重写下面三个方法
        initView();
        initData();
        initListener();
    }

    public void initView() {

    }

    public void initData() {

    }

    public void initListener() {

    }
}