package com.zr.car;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import com.zr.car.Base.BaseActivity;
import com.zr.car.Base.BasePresenter;
import com.zr.car.fragment.CYJFragment;
import com.zr.car.fragment.MyFragment;
import com.zr.car.fragment.SyFragment;
import com.zr.car.fragment.VipFragment;
import com.zr.car.myview.CustomScrollViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.view_pager)
    CustomScrollViewPager viewPager;
    @BindView(R.id.car_my_home)
    LinearLayout carMyHome;
    @BindView(R.id.car_my_homes)
    LinearLayout carMyHomes;
    @BindView(R.id.lay_one)
    LinearLayout layOne;
    @BindView(R.id.car_my_vip)
    LinearLayout carMyVip;
    @BindView(R.id.car_my_vips)
    LinearLayout carMyVips;
    @BindView(R.id.lay_two)
    LinearLayout layTwo;
    @BindView(R.id.car_my_cyj)
    LinearLayout carMyCyj;
    @BindView(R.id.car_my_cyjs)
    LinearLayout carMyCyjs;
    @BindView(R.id.lay_swe)
    LinearLayout laySwe;
    @BindView(R.id.car_my_my)
    LinearLayout carMyMy;
    @BindView(R.id.car_my_mys)
    LinearLayout carMyMys;
    List<Fragment> list = new ArrayList<>();
    List<LinearLayout> llist = new ArrayList<>();

    @Override
    protected BasePresenter providePresenter() {
        return null;
    }

    @Override
    protected void initData() {

        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
        viewPager.clearOnPageChangeListeners();
        carMyHome.setOnClickListener(this);
        carMyVip.setOnClickListener(this);
        carMyCyj.setOnClickListener(this);
        carMyMy.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        list.add(new SyFragment());
        list.add(new VipFragment());
        list.add(new CYJFragment());
        list.add(new MyFragment());
        llist.add(carMyHome);
        llist.add(carMyVip);
        llist.add(carMyCyj);
        llist.add(carMyMy);
        carMyHome.setVisibility(View.GONE);
        carMyHomes.setVisibility(View.VISIBLE);
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.car_my_home:
                carMyHome.setVisibility(View.GONE);
                carMyHomes.setVisibility(View.VISIBLE);
                carMyCyj.setVisibility(View.VISIBLE);
                carMyCyjs.setVisibility(View.GONE);
                carMyVip.setVisibility(View.VISIBLE);
                carMyVips.setVisibility(View.GONE);
                carMyMy.setVisibility(View.VISIBLE);
                carMyMys.setVisibility(View.GONE);
                viewPager.setCurrentItem(0);
                break;
            case R.id.car_my_vip:
                carMyHome.setVisibility(View.VISIBLE);
                carMyHomes.setVisibility(View.GONE);
                carMyCyj.setVisibility(View.VISIBLE);
                carMyCyjs.setVisibility(View.GONE);
                carMyVip.setVisibility(View.GONE);
                carMyVips.setVisibility(View.VISIBLE);
                carMyMy.setVisibility(View.VISIBLE);
                carMyMys.setVisibility(View.GONE);
                viewPager.setCurrentItem(1);
                break;
            case R.id.car_my_cyj:
                carMyHome.setVisibility(View.VISIBLE);
                carMyHomes.setVisibility(View.GONE);
                carMyCyj.setVisibility(View.GONE);
                carMyCyjs.setVisibility(View.VISIBLE);
                carMyVip.setVisibility(View.VISIBLE);
                carMyVips.setVisibility(View.GONE);
                carMyMy.setVisibility(View.VISIBLE);
                carMyMys.setVisibility(View.GONE);
                viewPager.setCurrentItem(2);
                break;
            case R.id.car_my_my:
                carMyHome.setVisibility(View.VISIBLE);
                carMyHomes.setVisibility(View.GONE);
                carMyCyj.setVisibility(View.VISIBLE);
                carMyCyjs.setVisibility(View.GONE);
                carMyVip.setVisibility(View.VISIBLE);
                carMyVips.setVisibility(View.GONE);
                carMyMy.setVisibility(View.GONE);
                carMyMys.setVisibility(View.VISIBLE);
                viewPager.setCurrentItem(3);
                break;
        }
    }
    private long firstTime = 0;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        long secondTime = System.currentTimeMillis();

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (secondTime - firstTime < 2000) {
                System.exit(0);
            } else {
                Toast.makeText(getApplicationContext(), "再按一次返回键退出", Toast.LENGTH_SHORT).show();
                firstTime = System.currentTimeMillis();
            }

            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}
