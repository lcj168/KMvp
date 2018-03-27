package com.example.whoislcj.kotlin.model.interfaces

/**
 * Created by whoislcj on 2018/3/20.
 */
interface IUserInfoModel<T> {

    fun getUserInfo(listener: GetUserInfoListener<T>);

}