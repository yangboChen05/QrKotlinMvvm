package com.ybc.qrmain.activity

import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.ybc.qrbase.base.QRBaseActivity
import com.ybc.qrbase.router.MyRouter
import com.ybc.qrmain.BR
import com.ybc.qrmain.R
import com.ybc.qrmain.databinding.ActivityMainBinding
import com.ybc.qrmain.viewmodel.MainViewModel

/**
 *
 * @Description: MainActivity
 * @Author: yangboChen
 * @CreateDate: 2023/3/31 17:50
 */
@Route(path = MyRouter.Constants.Activitys.ACTIVITY_MAIN)
class MainActivity : QRBaseActivity<ActivityMainBinding, MainViewModel>() {

    private var mFragments: ArrayList<Fragment>? = null

    override fun setContentViewResId(): Int {
        return R.layout.activity_main
    }

    override fun setVariableId(): Int {
        return BR.viewModel
    }

    override fun initData() {
        initFragment()
    }

    private fun initFragment() {
        //ARouter拿到多Fragment(这里需要通过ARouter获取，不能直接new,因为在组件独立运行时，宿主app是没有依赖其他组件，所以new不到其他组件的Fragment)
        val homeFragment: Fragment =
            ARouter.getInstance().build(MyRouter.Constants.Fragments.FRAGMENTS_HOME)
                .navigation() as Fragment
        val msgFragment: Fragment =
            ARouter.getInstance().build(MyRouter.Constants.Fragments.FRAGMENTS_MESSAGE)
                .navigation() as Fragment
        val meFragment: Fragment =
            ARouter.getInstance().build(MyRouter.Constants.Fragments.FRAGMENTS_MINE)
                .navigation() as Fragment
        mFragments = ArrayList<Fragment>()
        mFragments!!.add(homeFragment)
        mFragments!!.add(msgFragment)
        mFragments!!.add(meFragment)

        //默认选中第一个
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, homeFragment)
        transaction.commitAllowingStateLoss()
    }

}

