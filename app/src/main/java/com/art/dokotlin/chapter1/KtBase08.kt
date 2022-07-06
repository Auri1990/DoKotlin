package com.art.dokotlin.chapter1

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 08.Kotlin 语言的只读变量
 */

fun main(){
    // var 可读可改； val 不可改只可读
    val info : String = "Auri is coding"
    println(info)

    var age : Int = 34
    age = 35
    println(age)
}