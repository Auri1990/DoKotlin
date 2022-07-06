package com.art.dokotlin.chapter1

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO.16 Kotlin 语言的函数头学习
 */

fun main() {
    method01(66, "Nav")
}

/**
 * 默认是 public 修饰
 * fun: 函数声明关键字
 * method01: 函数名
 * Kotlin 的函数更规范（现有输入，再写输出）
 */
private fun method01(age: Int, name: String): Int {
    println("姓名是：$name,年龄是：$age")
    return 200
}
