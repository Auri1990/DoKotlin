package com.art.dokotlin.chapter3

/**
 * Description: TODO 44.Kotlin split
 * Conclusion:
 */

fun main() {
    val targetStr = "Spring,Summer,Autumn,Winter"
    val list = targetStr.split(",") // list 自动类型推断成 list == List<String>

    println("直接输出不解构: $list")

    val (v1, v2, v3, v4) = list
    println("解构输出：v1=$v1, v2=$v2, v3=$v3, v4=$v4")
}