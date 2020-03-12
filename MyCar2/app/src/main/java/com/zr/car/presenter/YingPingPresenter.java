package com.zr.car.presenter;


import android.util.Log;
import android.widget.Toast;

import com.zr.car.Base.BasePresenter;
import com.zr.car.app.App;
import com.zr.car.bean.YingPingBean;
import com.zr.car.contract.HomeConteract;
import com.zr.car.model.YingPingModel;

public class YingPingPresenter extends BasePresenter<HomeConteract.PingLunContreact.IView> implements HomeConteract.PingLunContreact.IPresenter {

    private YingPingModel loginModel;

    @Override
    protected void initModel() {
        loginModel = new YingPingModel();
    }

    @Override
    public void getPingLunPresenter( String movieId, Integer page, String count) {
        loginModel.getPingLunDataModel( movieId, page, count, new HomeConteract.PingLunContreact.IModel.IModelCallback() {
            @Override
            public void onPingLunSuccess(YingPingBean data) {
                if (data!=null){
                    Log.d("aaaa", "onPingLunSuccess: "+data.getMessage());
                    if (data!=null && data.getStatus().equals("0000")){

                        getView().onPingLunSuccess(data);
                    }
                }
            }

            @Override
            public void onPingLunFailure(Throwable e) {
                if (isViewAttached()){
                    if (e!=null){
                        Log.d("kkkkkk", "onPingLunFailure: "+e.toString());
                    }
                    getView().onPingLunFailure(e);
                }
            }
        });
    }
}
