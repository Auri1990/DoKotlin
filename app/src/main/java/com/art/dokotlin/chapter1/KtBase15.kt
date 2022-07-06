package com.art.dokotlin.chapter1

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 15.Kotlin 语言的 String 模版
 */

fun main() {
    val garden = "圆明园"
    val time = 6

    println("天气很好，去${garden}看妹子，玩了$time 钟头") // Kotlin 字符串模版写法

    // Kotlin if 是表达式，可以更灵活的书写
    val isLogin = false
    println("server response result: ${if (isLogin) "登陆成功！" else "登陆失败，请检查 Request 信息"}")
}