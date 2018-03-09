package com.example.cloud.mymvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.cloud.mymvp.com.cloud.biz.feeddetail.contract.FeedContract;
import com.example.cloud.mymvp.com.cloud.biz.feeddetail.contract.FeedDetailPresenter;
import com.example.cloud.mymvp.com.cloud.biz.feeddetail.entity.BaseFeedModuleEntity;

public class MainActivity extends AppCompatActivity implements FeedContract.IView{

    private FeedContract.Presenter mPresenter;
    private TextView helloText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new FeedDetailPresenter(this,this);
        helloText = findViewById(R.id.hello);
        helloText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.start();
            }
        });
    }

    @Override
    public void setPresenter(FeedContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void updateUI(boolean isRefresh, BaseFeedModuleEntity feedDetailEntity) {
        if(!isRefresh) {
            helloText.setText("cloud");
        }
    }
}
