package com.example.whoislcj.kotlin.presenter.impl

import com.example.whoislcj.kotlin.model.bean.UserInfo
import com.example.whoislcj.kotlin.model.impl.UserInfoModelImpl
import com.example.whoislcj.kotlin.model.interfaces.GetUserInfoListener
import com.example.whoislcj.kotlin.model.interfaces.IUserInfoModel
import com.example.whoislcj.kotlin.presenter.interfaces.ILoadDataPresenter
import com.example.whoislcj.kotlin.view.interfaces.ILoadDataView
import com.example.whoislcj.testproject.Person

/**
 * Created by whoislcj on 2018/3/20.
 */
class LoadDataPresenter(var iLoadDataView: ILoadDataView<UserInfo>) : ILoadDataPresenter {
    var iUserInfoModel: IUserInfoModel;

    override fun loadData() {
        iLoadDataView.startLoading()
        iUserInfoModel.getUserInfo(object : GetUserInfoListener {
            override fun onGetUserInfo(userInfo: UserInfo) {
                iLoadDataView.loadSuccess(userInfo)
                iLoadDataView.finishLoading()
            }
        });

    }

    init {
        this.iUserInfoModel = UserInfoModelImpl()
    }
}

