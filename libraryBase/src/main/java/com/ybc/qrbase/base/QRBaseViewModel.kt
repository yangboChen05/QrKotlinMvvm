package com.ybc.qrbase.base

import androidx.lifecycle.ViewModel

/**
 *
 * @Description: BaseViewModel
 * @Author: yangboChen
 * @CreateDate: 2023/4/1 21:15
 */
abstract class QRBaseViewModel : ViewModel() {

    //初始化数据
    abstract fun init()
}