package com.ybc.qrbase.utils

import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.launcher.ARouter

/**
 *
 * @Description: 启动页面管理类
 * @Author: yangboChen
 * @CreateDate: 2023/4/3 14:27
 */
class ARStartActivityUtils {

    public fun openActivity(path: String, build: Postcard.() -> Unit = {}) {
        val postcard = ARouter.getInstance().build(path)
        postcard.build()
        postcard.navigation()
    }

}