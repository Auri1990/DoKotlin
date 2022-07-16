package com.art.dokotlin.chapter2

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 24.Kotlin 函数类型&隐式返回
 */
fun main(){
    // 第一步：函数输入输出的声明
    val methodAction : (input : String) -> String

    // 第二步：函数实现
    methodAction = {
        val dddd = 987
        "$it $dddd Auri"
        // 匿名函数不用写 return ，最后一行就是返回值
    }

    // 第三步：调用函数
    println(methodAction("Hello"))
}