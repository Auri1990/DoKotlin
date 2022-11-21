package com.art.dokotlin.chapter3

/**
 * Description: TODO 48.Kotlin 数字类型的安全转换函数
 * Conclusion: 字符串转换整型时，尽量用 toIntOrNull
 */
fun main() {
    val number: Int = "333".toInt() // 与 .toInt(10) 运行逻辑一致
    println(number) // 333

//    val number2 = "333.3".toInt()
//    println(number2) // NumberFormatException

    val number3 = "666".toIntOrNull() // 与 .toIntOrNull(10) 运行逻辑一致
    println(number3) // 666

    val number4 = "666.6".toIntOrNull()
    println(number4) // null

    val number5: Int? = "777.77".toIntOrNull()
    println(number5 ?: "原来是null")
}