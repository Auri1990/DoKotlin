package com.art.dokotlin.chapter1

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 13.Kotlin 语言的 range 表达式
 */

fun main() {
    val number = 148;

    // range 表示范围，从哪里（闭合）到哪里（闭合）
    if (number in 0..9) {
        println("不及格且很差")
    } else if (number in 10..59) {
        println("不及格")
    } else if (number in 60..100) {
        println("合格")
    } else if (number !in 0..100) {
        println("分数不在 0 到 100 范围内")
    }
}