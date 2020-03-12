package com.zr.car.app;

import android.app.Application;

public class App extends Application {
    private static App sContext;
    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
    }
    public static App getAppContext() {
        return sContext;
    }
}
