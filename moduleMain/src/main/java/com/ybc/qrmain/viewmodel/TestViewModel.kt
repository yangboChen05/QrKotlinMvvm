package com.ybc.qrmain.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.ybc.qrbase.base.QRBaseViewModel
import kotlin.properties.Delegates
import android.widget.Toast.makeText as makeText1

/**
 *
 * @Description:
 * @Author: yangboChen
 * @CreateDate: 2023/4/3 16:19
 */
class TestViewModel : QRBaseViewModel() {
    public var text: String = ""
    var dataList: Array<String> = arrayOf()

    val isShowToast: MutableLiveData<Boolean> = MutableLiveData()

    override fun init() {
        text = "你好的很的"
        Log.e("Tag", "init TestViewModel dddddddddddddddddddddddddddddddddddddddd")
    }

    fun onClick() {
        val e = Log.e("Tag", "点击测试dddddddddddddddddddddddddddddddddddddddd")
        isShowToast.postValue(true)
    }

    fun vars(vararg v: Int) {
        for (vt in v) {
            print(vt)
            Log.e("Tag", "点击测试varsdddddddddddddddddddddddddddddddddddddddd" + print(vt))
        }
    }

    /**
     * //匿名函数
     */
    val lambdaSum: (Int, Int) -> Int = { x, y -> x + y }

    fun testCode(): Int {
        var a = 1
        // 模板中的简单名称：
        val s1 = "a is $a"
        return a

        //类型后面加?表示可为空
        var age: String? = "22"
        //抛出空指针异常
        val ages = age!!.toInt()
//不做处理返回 null
        val ages1 = age?.toInt()
//age为空返回-1
        val ages2 = age?.toInt() ?: -1

        for (i in 4 downTo 1 step 2) {
            print(i)
        }

        for (i in 1 until 10) {

        }

        //shl   shr   ushr  or xor and inv

        val g: Array<Int> = arrayOf(1, 2, 3, 4)
        val b = Array(3, { i -> (i * 2) })

        var text = """
            多行
            多行
            """.trimMargin()
        print(text)

        val int2 = 10
        val stri3 = "int2 = $int2"
        val str4 = "$stri3.length = ${stri3.length}"
        print(stri3)

        val c = 4
        val d = 5
        val max = if (c > d) c else d

        when (c) {
            1 ->
                print("2")
            2 ->
                print("2")
            3, 4 ->
                print("34")
            else -> {
                print("else")
            }

        }

        when (c) {
            in (1..10) ->
                print("")
            !in (20..30) -> print("")
            else -> {

            }
        }

        when (str4) {
            is String -> print("")
            else -> {
                str4.startsWith("prefix")

            }
        }

        val intcc: Int = 0
        when {
            intcc.equals(2) -> print("")
        }

        var arrs: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7)
        for (i in arrs) {
            print(arrs[i])
        }

        for ((index, value) in arrs.withIndex()) {
            print("index=$index value=$value")
        }

        loop@ for (i in 1..100) {
            for (j in 1..100) {
                if (j == 50) break@loop
            }
        }
    }

    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }

    fun getStringLength(obj: Any): Int? {
        if (obj !is String)
            return null
        // 在这个分支中, `obj` 的类型会被自动转换为 `String`
        return obj.length
    }

    class person {

        init {

        }

        var name: String = "zhangshan"
            get() = field.toUpperCase()
            set

        var age: Int = 20
            get() = field
            set(value) {
                if (value < 10) {
                    field = value
                } else {
                    field = -1
                }
            }

    }

    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        val tempsd = this[index1]
        this[index1] = this[index2]
        this[index2] = tempsd
    }

    var list = mutableListOf<Int>(1, 2, 3)

    class myClass {
        companion object {}
    }

    fun <T> int2dd(t: T) {

    }

    class Box1<T>(t: T) {

    }

    class User {
        var name: String by Delegates.observable("初始值") { prop, old, new ->
            println("旧值：$old -> 新值：$new")
        }
    }

}