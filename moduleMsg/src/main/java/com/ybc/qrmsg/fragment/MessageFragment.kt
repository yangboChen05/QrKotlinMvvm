package com.ybc.qrmsg.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.ybc.qrbase.base.QRBaseFragment
import com.ybc.qrbase.router.MyRouter
import com.ybc.qrmsg.BR
import com.ybc.qrmsg.R
import com.ybc.qrmsg.databinding.MsgFragmentMessageBinding
import com.ybc.qrmsg.viewmodel.MessageViewModel

/**
 *
 * @Description:
 * @Author: yangboChen
 * @CreateDate: 2023/4/7 11:02
 */
@Route(path = MyRouter.Constants.Fragments.FRAGMENTS_MESSAGE)
class MessageFragment : QRBaseFragment<MsgFragmentMessageBinding, MessageViewModel>() {

    override fun initContentView(
        inflater: LayoutInflater?,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): Int {
        return R.layout.msg_fragment_message
    }

    override fun setVariableId(): Int {
        return BR.viewModel
    }

    override fun initData() {

    }
}