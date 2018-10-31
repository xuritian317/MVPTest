package com.example.xu.myapplication.contract;

import java.util.List;

public interface MainContract {

    interface View {
        void setPresenter(Presenter presenter);


        List<String> getList();
    }

    interface Presenter {
        void initData();

        void getData();

        void setFlag(String data); //panduan data

    }


}
