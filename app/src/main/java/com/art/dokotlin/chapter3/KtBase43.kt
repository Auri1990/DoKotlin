package com.art.dokotlin.chapter3

/**
 * Description: TODO 43.Kotlin substring
 * Conclusion:
 */

const val TITLE = "AutumnRiver is a student"

fun main(){
    val index = TITLE.indexOf("is");
    println(TITLE.substring(0,index))
    println(TITLE.substring(0 until index)) // 两种写法等同
}