package com.zr.car.api;


import com.zr.car.bean.YingPingBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    //根据电影的id查询电影评论
    @GET("movie/v2/findAllMovieComment")
    Observable<YingPingBean> getYingPing(
            @Query("movieId") String movieId,
            @Query("page") Integer page,
            @Query("count") String count);
}
