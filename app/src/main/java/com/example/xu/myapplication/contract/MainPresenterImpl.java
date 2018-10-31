package com.example.xu.myapplication.contract;

import android.content.Context;

public class MainPresenterImpl implements MainContract.Presenter {
    private Context mContext;
    private MainContract.View mView;

    public MainPresenterImpl(Context mContext, MainContract.View mView) {
        this.mContext = mContext;
        this.mView = mView;
        mView.setPresenter(this);
    }


    @Override
    public void initData() {

    }

    @Override
    public void getData() {

    }

    @Override
    public void setFlag(String data) {
        if (data == null) {
            mView.getList();
        }
    }
}
