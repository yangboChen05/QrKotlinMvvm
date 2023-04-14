package com.ybc.qrmain.activity

import android.widget.Toast
import androidx.lifecycle.Observer
import com.alibaba.android.arouter.core.LogisticsCenter
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.ybc.qrbase.base.QRBaseActivity
import com.ybc.qrbase.router.MyRouter
import com.ybc.qrmain.BR
import com.ybc.qrmain.R
import com.ybc.qrmain.databinding.MainActivityTestBinding
import com.ybc.qrmain.viewmodel.TestViewModel


/**
 *
 * @Description:
 * @Author: yangboChen
 * @CreateDate: 2023/4/3 11:20
 */
@Route(path = MyRouter.Constants.Activitys.ACTIVITY_TEST)
class TestActivity : QRBaseActivity<MainActivityTestBinding, TestViewModel>() {

    override fun setContentViewResId(): Int {
        return R.layout.main_activity_test
    }

    override fun setVariableId(): Int {
        return BR.viewModel
    }

    override fun initData() {
        mViewModel.isShowToast.observe(this, Observer {
            val toast: Toast = Toast.makeText(this, "点击了按钮", Toast.LENGTH_SHORT)
            toast.show()
        })

    }

    fun onClick2(){
        val postcard: Postcard = ARouter.getInstance().build("COM_ACTIVITY_RESULT")
        LogisticsCenter.completion(postcard)
    }
}