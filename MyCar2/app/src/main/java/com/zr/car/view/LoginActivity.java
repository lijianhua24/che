package com.zr.car.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.zr.car.Base.BaseActivity;
import com.zr.car.Base.BasePresenter;
import com.zr.car.R;
import com.zr.car.bean.YingPingBean;
import com.zr.car.contract.HomeConteract;
import com.zr.car.presenter.YingPingPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity<YingPingPresenter> implements HomeConteract.PingLunContreact.IView {

    String TAG="LoginActivity";
    @BindView(R.id.car_login_registered)
    TextView carLoginRegistered;
    @BindView(R.id.login_phone)
    ImageView loginPhone;
    @BindView(R.id.car_login_phone)
    EditText carLoginPhone;
    @BindView(R.id.car_login_cw)
    ImageView carLoginCw;
    @BindView(R.id.login_suo)
    ImageView loginSuo;
    @BindView(R.id.car_login_pwd)
    EditText carLoginPwd;
    @BindView(R.id.car_login_by)
    ImageView carLoginBy;
    @BindView(R.id.car_lgin_code)
    TextView carLginCode;
    @BindView(R.id.car_login_forget)
    TextView carLoginForget;
    @BindView(R.id.car_login_bt)
    ImageButton carLoginBt;
    @BindView(R.id.car_login_wx)
    ImageView carLoginWx;
    boolean biyan = false;
    boolean phone = false;
    boolean pwd = false;


    @Override
    protected YingPingPresenter providePresenter() {
        return new YingPingPresenter();
    }

    @Override
    protected void initData() {
        carLoginPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d(TAG, "beforeTextChanged: "+charSequence);
                if ( i>0 ||i == 0){
                    phone = true;
                }else {
                    phone = false;
                }
                if (phone==true && pwd == true){
                    carLoginBt.setBackgroundResource(R.drawable.yuanjiaos);
                    Log.d(TAG, "carLoginCw: ===============================2");
                }else {
                    carLoginBt.setBackgroundResource(R.drawable.yuanjiao);
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        carLoginPwd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d(TAG, "beforeTextChanged: "+charSequence);
                Log.d(TAG, "i: "+i);
                Log.d(TAG, "i1: "+i1);
                Log.d(TAG, "i2: "+i2);
                if ( i>0 || i == 0){
                    pwd = true;
                }else {
                    pwd = false;
                }
                if (phone==true && pwd == true){
                    carLoginBt.setBackgroundResource(R.drawable.yuanjiaos);
                    Log.d(TAG, "carLoginCw: ===============================2");
                }else {
                    carLoginBt.setBackgroundResource(R.drawable.yuanjiao);
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }

    @Override
    protected void initView() {
            mPresenter.getPingLunPresenter("21",1,"10");
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_login;
    }


    @OnClick({R.id.car_login_registered, R.id.car_login_cw, R.id.car_login_by, R.id.car_lgin_code, R.id.car_login_forget, R.id.car_login_bt, R.id.car_login_wx})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.car_login_registered:
                startActivity(new Intent(LoginActivity.this,RegisteredActivity.class));
                break;
            case R.id.car_login_cw:
                carLoginPhone.setText("");
                //Toast.makeText(this, "123123", Toast.LENGTH_SHORT).show();
                break;
            case R.id.car_login_by:
                biyan=!biyan;
                if (biyan){
                    carLoginBy.setBackgroundResource(R.mipmap.login_zhengyan);
                    carLoginPwd.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    carLoginPwd.setSelection((carLoginPwd.getText().toString().trim()).length());
                }else {
                    carLoginBy.setBackgroundResource(R.mipmap.login_biyan);
                    carLoginPwd.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    carLoginPwd.setSelection((carLoginPwd.getText().toString().trim()).length());
                }
                break;
            case R.id.car_lgin_code:
                startActivity(new Intent(LoginActivity.this,CodeActivity.class));
                break;
            case R.id.car_login_forget:
                startActivity(new Intent(LoginActivity.this,ForgetActivity.class));
                break;
            case R.id.car_login_bt:
                break;
            case R.id.car_login_wx:
                break;
        }
    }

    @Override
    public void onPingLunSuccess(YingPingBean data) {
        Log.d(TAG, "onPingLunSuccess:================== "+data.getMessage());
    }

    @Override
    public void onPingLunFailure(Throwable e) {

    }
}
