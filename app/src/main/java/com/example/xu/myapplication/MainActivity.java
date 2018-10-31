package com.example.xu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListAdapter;

import com.example.xu.myapplication.http.HttpManager;
import com.example.xu.myapplication.contract.MainContract;
import com.example.xu.myapplication.contract.MainPresenterImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter mPresenter;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MainPresenterImpl(this, this);
        mPresenter.initData();


        mPresenter.setFlag("data");

    }





    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public List<String> getList() {
        return list;
    }


}
