package com.art.dokotlin.chapter2

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 25.Kotlin 函数参数的学习
 */

fun main(){

    // 第一步 函数输入输出的声明；第二步 对声明函数的实现
    val methodAction : (Int, Int, Int) -> String = { number1, number2, number3 ->
        val theValue = 654
        "$number1, $number2, $number3, $theValue, Auri"
    }

    // 第三步 调用此函数
    println(methodAction(33,44,55))
}

/* 上述写法 等同于如下写法
fun methodAction (number1 : Int, number2: Int, number3: Int) : String {
    val theValue = 654
    return "$number1, $number2, $number3, $theValue, Auri"
}
 */