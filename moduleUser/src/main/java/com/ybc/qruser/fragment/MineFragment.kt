package com.ybc.qruser.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.ybc.qrbase.base.QRBaseFragment
import com.ybc.qrbase.router.MyRouter
import com.ybc.qruser.BR
import com.ybc.qruser.R
import com.ybc.qruser.databinding.UserFragmentMineBinding
import com.ybc.qruser.vewmodel.MineViewModel

/**
 *
 * @Description:
 * @Author: yangboChen
 * @CreateDate: 2023/4/7 11:08
 */
@Route(path = MyRouter.Constants.Fragments.FRAGMENTS_MINE)
class MineFragment : QRBaseFragment<UserFragmentMineBinding, MineViewModel>() {

    override fun initContentView(
        inflater: LayoutInflater?,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): Int {
        return R.layout.user_fragment_mine
    }

    override fun setVariableId(): Int {
        return BR.viewModel
    }

    override fun initData() {

    }
}