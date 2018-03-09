package com.example.cloud.mymvp.com.cloud.biz.feeddetail.contract;

import android.content.Context;

import com.example.cloud.mymvp.com.cloud.biz.feeddetail.entity.BaseFeedModuleEntity;
import com.example.cloud.mymvp.com.cloud.biz.feeddetail.model.FeedDetailModel;
import com.example.cloud.mymvp.com.cloud.biz.feeddetail.model.IFeedDetailModel;

import java.lang.ref.WeakReference;

/**
 * Created by hanzhang on 2018/3/7.
 */

public class FeedDetailPresenter implements FeedContract.Presenter,IFeedDetailModel.loadDataCallback {

    private WeakReference<Context> mContext;

    private final FeedContract.IView mFeedDetailView;

    private final FeedDetailModel mFeedDetailModel;

    public FeedDetailPresenter(Context context,FeedContract.IView mFeedDetailView) {
        this.mContext = new WeakReference<Context>(context);
        this.mFeedDetailView = mFeedDetailView;
        mFeedDetailModel = new FeedDetailModel();
        mFeedDetailView.setPresenter(this);
    }
    @Override
    public void start() {
        String feedDetailData = mFeedDetailModel.getFeedDetailData(this);
        mFeedDetailView.updateUI(false,null );
    }

    @Override
    public void onSuccess(BaseFeedModuleEntity entity) {

    }

    @Override
    public void onFail() {

    }
}
