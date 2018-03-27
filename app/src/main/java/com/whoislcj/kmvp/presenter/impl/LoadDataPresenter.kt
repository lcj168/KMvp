package com.example.whoislcj.kotlin.presenter.impl

import com.example.whoislcj.kotlin.model.bean.UserInfo
import com.example.whoislcj.kotlin.model.impl.UserInfoModelImpl
import com.example.whoislcj.kotlin.model.interfaces.GetUserInfoListener
import com.example.whoislcj.kotlin.model.interfaces.IUserInfoModel
import com.example.whoislcj.kotlin.presenter.interfaces.ILoadDataPresenter
import com.example.whoislcj.kotlin.view.interfaces.ILoadDataView

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

