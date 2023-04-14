package com.ybc.qrbase.router

/**
 *
 * @Description: activity 路由
 * @Author: yangboChen
 * @CreateDate: 2023/3/31 17:50
 */
class MyRouter {

    object Constants {
        object Activitys {
            //主页
            const val ACTIVITY_MAIN : String = "/moduleMain/MainActivity"
            //Test页面
            const val ACTIVITY_TEST : String = "/moduleMain/activity/TestActivity"
            //登录页面
            const val ACTIVITY_LOGIN : String = "/moduleUser/LoginActivity"
        }

        object Fragments {
            const val FRAGMENTS_HOME = "/moduleHome/fragment/home"
            const val FRAGMENTS_MESSAGE = "/moduleMsg/fragment/message"
            const val FRAGMENTS_MINE = "/moduleUser/fragment/mine"
        }
    }

}