package com.zr.car;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zr.car.Base.BaseActivity;
import com.zr.car.Base.BasePresenter;

public class MainActivity extends BaseActivity {



    @Override
    protected BasePresenter providePresenter() {
        return null;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_main;
    }
}
