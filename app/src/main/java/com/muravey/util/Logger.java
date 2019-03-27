package com.muravey.util;

import android.util.Log;

public class Logger {
    private static  String TAG = "qwe";


    public  void d(String message){
        Log.d(TAG, message);

    }
    public  void e(Exception exception){
        Log.e(TAG, exception.getMessage(),exception);

    }
}
