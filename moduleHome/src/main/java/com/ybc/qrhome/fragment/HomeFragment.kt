package com.ybc.qrhome.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.ybc.qrbase.base.QRBaseFragment
import com.ybc.qrbase.router.MyRouter
import com.ybc.qrhome.BR
import com.ybc.qrhome.R
import com.ybc.qrhome.databinding.HomeFragmentHomeBinding
import com.ybc.qrhome.veiwmodel.HomeViewModel

/**
 *
 * @Description:
 * @Author: yangboChen
 * @CreateDate: 2023/4/6 17:55
 */
@Route(path = MyRouter.Constants.Fragments.FRAGMENTS_HOME)
class HomeFragment : QRBaseFragment<HomeFragmentHomeBinding, HomeViewModel>() {

    override fun initContentView(
        inflater: LayoutInflater?,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): Int {
        return R.layout.home_fragment_home
    }

    override fun setVariableId(): Int {
        return BR.viewModel
    }

    override fun initData() {

    }
}