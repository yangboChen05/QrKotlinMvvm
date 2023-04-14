package com.ybc.qruser.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.ybc.qrbase.router.MyRouter
import com.ybc.qruser.R

/**
 *
 * @Description: 登录页面
 * @Author: yangboChen
 * @CreateDate: 2023/4/1 19:55
 */
@Route(path = MyRouter.Constants.Activitys.ACTIVITY_LOGIN)
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_activity_login)
    }
}