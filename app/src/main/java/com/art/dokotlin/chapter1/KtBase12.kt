package com.art.dokotlin.chapter1

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 12.Kotlin 语言的引用类型学习
 *
 * Java 语言有两种数据类型：
 *  基本类型：int double 等等
 *  引用类型：String 等等
 *
 * Kotlin 语言只有一种数据类型
 *  看起来都是引用类型，实际编译器会在 Java 字节码中，修改成 "基本类型"，无需担心运行时的性能的损耗。
 */

fun main() {
    val age: Int = 99
    val pi: Float = 3.1415f
    val pi2: Double = 3.1415926
    val isOk: Boolean = true
}