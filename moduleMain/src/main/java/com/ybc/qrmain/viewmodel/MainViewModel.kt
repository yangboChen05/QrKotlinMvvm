package com.ybc.qrmain.viewmodel

import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter
import com.ybc.qrbase.base.QRBaseViewModel
import com.ybc.qrbase.router.MyRouter
import com.ybc.qrbase.utils.ARStartActivityUtils

/**
 *
 * @Description:
 * @Author: yangboChen
 * @CreateDate: 2023/4/1 21:21
 */
class MainViewModel : QRBaseViewModel() {

    override fun init() {

    }

    fun myOnClick(){
        Log.e("MainViewModel","我是点击事件----------------------------")
        ARouter.getInstance().build(MyRouter.Constants.Activitys.ACTIVITY_LOGIN).navigation()
//        ARStartActivityUtils().openActivity(MyRouter.Constants.Activitys.ACTIVITY_LOGIN){withString("key","str")}
    }

}