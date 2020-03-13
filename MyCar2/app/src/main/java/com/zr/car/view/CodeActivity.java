package com.zr.car.view;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.zr.car.Base.BaseActivity;
import com.zr.car.Base.BasePresenter;
import com.zr.car.R;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CodeActivity extends BaseActivity {


    @BindView(R.id.car_code_registered)
    TextView carCodeRegistered;
    @BindView(R.id.login_phone)
    ImageView loginPhone;
    @BindView(R.id.car_code_phone)
    EditText carCodePhone;
    @BindView(R.id.car_code_cw)
    ImageView carCodeCw;
    @BindView(R.id.login_suo)
    ImageView loginSuo;
    @BindView(R.id.car_code_code)
    EditText carCodeCode;
    @BindView(R.id.car_code_obtain)
    TextView carCodeObtain;
    @BindView(R.id.car_code_pwd)
    TextView carCodePwd;
    @BindView(R.id.car_code_forget)
    TextView carCodeForget;
    @BindView(R.id.car_code_bt)
    Button carCodeBt;
    @BindView(R.id.car_code_wx)
    ImageView carCodeWx;
    @BindView(R.id.car_code_codes)
    TextView carCodeCodes;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            carCodeCodes.setText(msg.toString());
        }
    };
    Timer timer = new Timer();
    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            Message message = new Message();
            message.what = 0;
            handler.sendMessage(message);
        }
    };

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
        return R.layout.activity_code;
    }


    @OnClick({R.id.car_code_registered, R.id.car_code_cw, R.id.car_code_obtain, R.id.car_code_forget, R.id.car_code_bt, R.id.car_code_wx, R.id.car_code_codes})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.car_code_registered:
                break;
            case R.id.car_code_cw:
                break;
            case R.id.car_code_obtain:
                break;
            case R.id.car_code_forget:

                break;
            case R.id.car_code_bt:
                break;
            case R.id.car_code_wx:
                break;
            case R.id.car_code_codes:
                timer.schedule(timerTask, 2000);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        timer.cancel();
    }
}
