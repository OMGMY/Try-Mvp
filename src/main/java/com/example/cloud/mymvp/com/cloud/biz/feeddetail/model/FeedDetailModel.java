package com.example.cloud.mymvp.com.cloud.biz.feeddetail.model;

/**
 * Created by hanzhang on 2018/3/7.
 */

public class FeedDetailModel implements IFeedDetailModel<String> {

    @Override
    public String getFeedDetailData(IFeedDetailModel.loadDataCallback callback) {
        return "cloud";
    }
}
