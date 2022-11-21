package com.art.dokotlin.chapter3

/**
 * Description: TODO 47.Kotlin 字符串遍历
 * Conclusion: str.forEach{}
 */
fun main() {
    val str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    str.forEach {
        // c -> 用 c 来替代 it，相当于修改参数名称
        // it == str 的每一个字符
        print("char:$it ")
    }
}