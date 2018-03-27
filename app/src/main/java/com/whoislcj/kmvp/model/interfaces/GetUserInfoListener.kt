package com.example.whoislcj.kotlin.model.interfaces

import com.example.whoislcj.kotlin.model.bean.UserInfo

/**
 * Created by whoislcj on 2018/3/20.
 */
public interface GetUserInfoListener<T> {

    fun onGetUserInfo(result: T );
}