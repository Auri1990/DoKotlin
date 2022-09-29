package com.art.dokotlin.chapter2

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 28.Kotlin lambda 学习
 * 匿名函数 属于 lambda
 */

fun main(){

    val addResuleMethod = { num1: Int, num2: Int ->
        "两数相加 = ${num1 + num2}"
    } // 等同于函数：(Int,Int) -> String
    println(addResuleMethod(99,123))

    // 匿名函数 入参 Int， 返回 Any
    // lambda 表达式入参 Int，返回 Any
    val weekResultMethod = {num: Int ->
        when(num){
            1 -> "星期一"
            2 -> "星期二"
            else -> -1
        }
    } // 等同于函数：(Int) -> Any
    println(weekResultMethod(2))
}