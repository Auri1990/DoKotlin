package com.art.dokotlin.chapter3

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 36.Kotlin 安全调用操作符
 */

fun main(){
    var name: String? = "AutumnRiver"
//    name = null

    val rr = name?.capitalize()
    println(rr)
}