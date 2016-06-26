package com.example.coolweatherdemo.util;

/**
 * Created by Administrator on 2016/6/26.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}
