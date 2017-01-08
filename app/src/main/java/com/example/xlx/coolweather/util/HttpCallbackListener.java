package com.example.xlx.coolweather.util;

/**
 * Created by xlx on 2017/1/8.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
