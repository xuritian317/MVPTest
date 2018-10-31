package com.example.xu.myapplication.http;

public class HttpManager {

    static {
        //最先执行
    }

    public static HttpManager getInstance() {
        return Holder.INSTANCE;
    }

    private HttpManager() {
        //初始化
    }

    private static class Holder {
        private static final HttpManager INSTANCE = new HttpManager();
    }

    public void getData() {

    }

}
