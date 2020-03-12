package com.zr.car.contract;


import com.zr.car.Base.IBaseView;
import com.zr.car.bean.YingPingBean;

public interface HomeConteract {


    //根据电影的id查询电影评论
    interface PingLunContreact {
        interface IModel {
            void getPingLunDataModel(String movieId, Integer page, String count, IModelCallback callback);

            //model层中的接口回调
            interface IModelCallback {
                void onPingLunSuccess(YingPingBean data);

                void onPingLunFailure(Throwable e);
            }

        }

        //view层  命名必须是IView
        interface IView extends IBaseView {
            void onPingLunSuccess(YingPingBean data);

            void onPingLunFailure(Throwable e);


        }

        //presenter层   命名必须是IPresenter
        interface IPresenter {

            void getPingLunPresenter(String movieId, Integer page, String count);

        }
    }




}


