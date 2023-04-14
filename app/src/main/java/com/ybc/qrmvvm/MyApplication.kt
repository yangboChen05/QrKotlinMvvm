package com.ybc.qrmvvm

import android.app.Application
import com.alibaba.android.arouter.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter

/**
 *
 * @Description:
 * @Author: yangboChen
 * @CreateDate: 2023/3/31 16:34
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        //初始化阿里路由框架
        if (BuildConfig.DEBUG) {
            ARouter.openLog() // 打印日志
            ARouter.openDebug() // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this) // 尽可能早，推荐在Application中初始化
    }

    override fun onTerminate() {
        super.onTerminate()
        //阿里router需要释放
        ARouter.getInstance().destroy()
    }
}