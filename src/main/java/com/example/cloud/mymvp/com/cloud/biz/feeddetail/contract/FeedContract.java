package com.example.cloud.mymvp.com.cloud.biz.feeddetail.contract;

/**
 * Created by hanzhang on 2018/3/7.
 */

import com.example.cloud.mymvp.com.cloud.base.BasePresenter;
import com.example.cloud.mymvp.com.cloud.base.BaseView;
import com.example.cloud.mymvp.com.cloud.biz.feeddetail.entity.BaseFeedModuleEntity;

/**
 *  Contract 用于将view接口和presenter进行合并管理，避免代码碎片化
 *
 */
public interface FeedContract {

    interface IView extends BaseView<Presenter> {

       void updateUI(boolean isRefresh, BaseFeedModuleEntity feedDetailEntity);

    }
    interface Presenter extends BasePresenter {

    }
}
