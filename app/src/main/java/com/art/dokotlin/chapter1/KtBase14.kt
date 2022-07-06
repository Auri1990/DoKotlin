package com.art.dokotlin.chapter1

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 14.Kotlin 语言的 when 表达式
 * 功能相当于 Java 中的 swich case
 *
 * "表达式"与"语句"的区别：
 * Java 的 if 是语句；Kotlin的 if 是表达式，它有"返回值"
 *
 * Java 中的 void 是关键字; Kotlin 用 Unit类代替了 Java 的 void
 */

fun main(){
    val date = 0

    // 由于有不同类型的返回值，故这里返回 Any
    val info = when(date){
        1 -> "一"
        2 -> "二"
        3 -> "三"
        4 -> "四"
        5 -> "五"
        6 -> "六"
        7 -> "七"
        8 -> false
        else -> {
            println("忽略")
        }
    }
    println(info)  // 输出: kotlin.Unit
}