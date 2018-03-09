package com.example.cloud.mymvp.com.cloud.biz.feeddetail.model;

import com.example.cloud.mymvp.com.cloud.biz.feeddetail.entity.BaseFeedModuleEntity;

/**
 * Created by hanzhang on 2018/3/7.
 */

public interface IFeedDetailModel<T> {
    interface loadDataCallback {
        void onSuccess(BaseFeedModuleEntity entity);
        void onFail();
    }
    T getFeedDetailData(loadDataCallback callback);
}
