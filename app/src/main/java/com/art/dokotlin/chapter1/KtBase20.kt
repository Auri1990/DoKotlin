package com.art.dokotlin.chapter1

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 20.Kotlin 语言的 Nothing 类型特点
 */

fun main() {
    show(101) // kotlin.NotImplementedError: An operation is not implemented: Error
}

private fun show(number: Int) {
    when (number) {
        in 0..59 -> println("不及格")
        in 60..100 -> println("及格")
        else -> TODO("Error")
    }
}

interface A {
    fun show()
}

class AImpl : A{
    override fun show() {
        // 下面这句话，不是注释提示。执行会终止程序
        TODO("Not yet implemented")
    }
}