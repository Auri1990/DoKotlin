package com.art.dokotlin.chapter2

/**
 * Created by cheng.qiu on 2022/07/16
 * Description: TODO.23 Kotlin 匿名函数学习
 */

fun main(){
    val len = "AutumnRiver".count()
    println(len) // 11

    val len2 = "AutumnRiver".count { // 括号内 就是匿名函数
        it == 'u' // it 等价于字符串当中的 char
    }
    println(len2) // 2
}