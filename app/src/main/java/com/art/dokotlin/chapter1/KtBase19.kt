package com.art.dokotlin.chapter1

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 19.Kotlin 语言的 Unit 函数特点
 *
 * Kotlin 用一个单例类 kotlin.Unit 来代替 Java 中的 void 关键字
 * 下面三种写法语义一致
 */

fun main(){}

private fun doWork00() : Unit{
    return println()
}

private fun doWork01(){
    return println()
}

private fun doWork02(){
    println()
}
