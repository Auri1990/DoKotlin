package com.art.dokotlin.chapter0

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 33.Kotlin 函数类型作为返回类型
 */

fun main() {
    val rr = show("学习 Kotlin")
}

fun show(info: String): Boolean {
    println("我是 show 函数 info:$info")
    return true
}

fun show2(info: String): String {
    println("我是 show 函数 info:$info")
    return "DDD"
}

fun showMethod(info: String): (String, Int) -> String {
    println("我是 show 函数 info:$info")

    // return 一个函数 这个函数是匿名函数
    return { name: String, age: Int ->
        "这是匿名函数: name:$name, age:$age"
    }
}
