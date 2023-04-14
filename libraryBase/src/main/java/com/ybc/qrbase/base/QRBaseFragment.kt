package com.ybc.qrbase.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import java.lang.reflect.ParameterizedType

/**
 *
 * @Description:BaseFragment
 * @Author: yangboChen
 * @CreateDate: 2023/4/1 21:25
 */
abstract class QRBaseFragment<VB : ViewDataBinding, VM : QRBaseViewModel> : Fragment() {
    lateinit var mViewModel: VM
    lateinit var mBinding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    /**
     * 创建VIEW
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(
            inflater,
            initContentView(inflater, container, savedInstanceState),
            container,
            false
        )
        return mBinding.getRoot()
    }

    /**
     * 创建view成功 初始化数据
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewDataBinding()
        initData()
    }

    /**
     * 初始化数据
     */
    abstract fun initData()

    /**
     * 初始化根布局
     *
     * @return 布局layout的id
     */
    abstract fun initContentView(
        inflater: LayoutInflater?,
        @Nullable container: ViewGroup?,
        @Nullable savedInstanceState: Bundle?
    ): Int

    /**
     * 初始化ViewModel的id
     *
     * @return BR的id
     */
    abstract fun setVariableId(): Int

    /**
     * 注入绑定
     */
    private fun initViewDataBinding() {
        val type: Class<VM> =
            (this.javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[1] as Class<VM>
        mViewModel = ViewModelProvider(this).get(type)
        mViewModel.init()

        mBinding.apply {
            //绑定生命周期
            lifecycleOwner = this@QRBaseFragment
            //mBinding绑定viewModel
            setVariable(setVariableId(), mViewModel)
        }

    }

}