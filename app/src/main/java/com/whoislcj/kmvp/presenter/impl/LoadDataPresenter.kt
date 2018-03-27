package com.whoislcj.kmvp.presenter.impl

import com.whoislcj.kmvp.model.bean.UserInfo
import com.example.whoislcj.kotlin.model.impl.UserInfoModelImpl
import com.whoislcj.kmvp.model.interfaces.GetUserInfoListener
import com.whoislcj.kmvp.model.interfaces.IUserInfoModel
import com.whoislcj.kmvp.presenter.interfaces.ILoadDataPresenter
import com.whoislcj.kmvp.view.interfaces.ILoadDataView

/**
 * Created by whoislcj on 2018/3/20.
 */
class LoadDataPresenter(var iLoadDataView: ILoadDataView<UserInfo>) : ILoadDataPresenter {
    private var iUserInfoModel: IUserInfoModel<UserInfo>;

    override fun loadData() {
        iLoadDataView.startLoading()
        iUserInfoModel.getUserInfo(object : GetUserInfoListener<UserInfo> {
            override fun onGetUserInfo(result: UserInfo) {
                iLoadDataView.loadSuccess(result)
                iLoadDataView.finishLoading()
            }
        });

    }

    init {
        this.iUserInfoModel = UserInfoModelImpl()
    }
}

