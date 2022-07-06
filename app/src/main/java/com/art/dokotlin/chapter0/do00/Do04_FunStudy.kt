package com.art.dokotlin.chapter0.do00

/**
 * Created by cheng.qiu on 2022/06/23
 * Description:
 */
class FunStudy {
}

// Unit == Java void
fun main(args: Array<String>) {

}

// ------ 隐式的返回值 与 简写
// 隐式的返回值 Unit == Java void
fun add(): Unit {
}

fun add(number1: Int, number2: Int): Int {
    return number1 + number2;
}

// 上面写法 等同于下面写法
fun add2(number1: Int, number2: Int): Int = number1 + number2


// ------ 推断返回类型系列
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