package com.zr.car.model;

import android.util.Log;

import com.zr.car.bean.YingPingBean;
import com.zr.car.contract.HomeConteract;
import com.zr.car.utils.CommonObserver;
import com.zr.car.utils.CommonSchedulers;
import com.zr.car.utils.RequestNet;

public class YingPingModel implements HomeConteract.PingLunContreact.IModel {
    @Override
    public void getPingLunDataModel(String movieId, Integer page, String count, IModelCallback callback) {
        RequestNet.getInstance().create().getYingPing(movieId, page,count)

                .compose(CommonSchedulers.<YingPingBean>io2main())
                .subscribe(new CommonObserver<YingPingBean>() {
                    @Override
                    public void onNext(YingPingBean loginBean) {
                        Log.d("ssss", "onNext: "+loginBean.getMessage());
                        callback.onPingLunSuccess(loginBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onPingLunFailure(e);
                    }
                });
    }
}
