package com.art.dokotlin.chapter1

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 09.Kotlin 语言的类型推断
 */

fun main(){
    val info : String = "Auri is coding" // String 这里给定类型是可以省略的
    val age = 98 // Int
    val young = false // Boolean
}

// 返回值类型推断为 Int
fun add3(number1: Int, number2: Int) = number1 + number2

// 返回值类型推断为 Double
fun add4(number1: Int, num2: Int) = number1 + num2.toDouble()

// 返回值类型推断为 String
fun method1() = "Auri"

// 返回值类型推断为 Char
fun method2() = 'A'

// 返回值类型推断为 Int
fun method3() = 99