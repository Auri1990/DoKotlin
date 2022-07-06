package com.art.dokotlin.chapter1

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 21.Kotlin 语言的反引号函数名特点
 */

fun main() {
    `测试功能`("12345")

    // in is 在 Java 中只是普通的函数名，但在 kt 中是关键字，需要使用反引号
    KtBase21.`in`()
    KtBase21.`is`()
}

private fun `测试功能`(input: String) {
    println("Test $input")
}