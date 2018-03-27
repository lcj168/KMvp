package com.example.whoislcj.kotlin.model.impl

import android.os.Handler
import com.whoislcj.kmvp.model.bean.UserInfo
import com.whoislcj.kmvp.model.interfaces.GetUserInfoListener
import com.whoislcj.kmvp.model.interfaces.IUserInfoModel

/**
 * Created by whoislcj on 2018/3/20.
 */
class UserInfoModelImpl : IUserInfoModel<UserInfo> {


    override fun getUserInfo(listener: GetUserInfoListener<UserInfo>) {
        Handler().postDelayed({
            val userInfo = UserInfo();
            userInfo.age = 28;
            userInfo.name = "lcj";
            listener.onGetUserInfo(userInfo);
        },3000)
    }


}