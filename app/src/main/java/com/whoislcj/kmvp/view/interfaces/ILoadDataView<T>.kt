package com.whoislcj.kmvp.view.interfaces

/**
 * Created by whoislcj on 2018/3/20.
 */
interface ILoadDataView<T> {

    fun  startLoading();

    fun  finishLoading();

    fun loadSuccess(result: T);

    fun loadFailed();

}