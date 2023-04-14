package com.ybc.qrbase.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.lifecycle.ViewModelProvider
import java.lang.reflect.ParameterizedType

/**
 *
 * @Description:BaseActivity
 * @Author: yangboChen
 * @CreateDate: 2023/4/1 21:24
 */
abstract class QRBaseActivity<VB : ViewDataBinding, VM : QRBaseViewModel> :
    AppCompatActivity() {
    lateinit var mViewModel: VM
    lateinit var mBinding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        initDataBinding()
        initData()
    }

    abstract fun setContentViewResId(): Int
    abstract fun setVariableId(): Int

    private fun initViewModel() {
        val type: Class<VM> =
            (this.javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[1] as Class<VM>
        mViewModel = ViewModelProvider(this).get(type)
        mViewModel.init()
    }

    private fun initDataBinding() {
        mBinding = DataBindingUtil.setContentView(this, setContentViewResId())
        mBinding.apply {
            //绑定生命周期
            lifecycleOwner = this@QRBaseActivity
            //mBinding绑定viewModel
            setVariable(setVariableId(), mViewModel)
        }
    }

    abstract fun initData()

}