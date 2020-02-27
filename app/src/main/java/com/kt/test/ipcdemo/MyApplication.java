package com.kt.test.ipcdemo;

import android.app.ActivityManager;
import android.app.Application;
import android.util.Log;

/**
 * @Author: dr
 * @Data: 2020-02-27
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("processName====", ":" + UserManager.getProcessName());

    }

}
