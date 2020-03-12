package com.zr.car.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zr.car.Base.BaseFragment;
import com.zr.car.Base.BasePresenter;
import com.zr.car.R;
/**
 *@Package: VipFragment.java
 *@describe(描述)：com.zr.car.fragment 会员
 *@ClassName: VipFragment
 *@data（日期）: 2020/3/12
 *@time（时间）: 10:31
 *@author（作者）: 李建华
 *@UpdateRemark: 更新说明：DELLa
 *@Version: 3.5
 **/


public class VipFragment extends BaseFragment {


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
        return R.layout.fragment_vip;
    }
}
