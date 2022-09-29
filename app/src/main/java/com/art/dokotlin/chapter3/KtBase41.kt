package com.art.dokotlin.chapter3

/**
 * Description: TODO 41.Kotlin 异常处理与自定义异常
 * Conclusion: try catch 与 java 用法基本一致
 */

fun main() {
    try {
        var info: String? = null
        checkException(info)
        println(info!!.length)
    } catch (e: Exception) {
        println("OMG $e")
    }
}

fun checkException(info: String?) {
    info ?: throw CustomException()
}

class CustomException : IllegalArgumentException("有空指针！")

