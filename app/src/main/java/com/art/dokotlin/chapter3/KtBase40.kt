package com.art.dokotlin.chapter3

/**
 * Description: TODO 40.Kotlin 空合并操作符
 * Conclusion: ?: 空合并操作符，如果对象是null，就会执行 ?: 后面的区域。常与 let 函数合用
 */

fun main() {
    var info: String? = "Sanaco"
    info = null
    println(info ?: "原来你是 null")

    println(info?.let{"【$it】"} ?: "NULL")
}