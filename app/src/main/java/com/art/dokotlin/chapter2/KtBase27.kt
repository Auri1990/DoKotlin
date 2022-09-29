package com.art.dokotlin.chapter2

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 27.Kotlin 语言的匿名函数类型推断
 */
fun main(){

    // 匿名函数，返回值类型默认推断为 String
    // 方法名：必须制定 参数类型 和 返回类型
    val method1 = {v1: Double, v2: Float, v3: Int ->
        "v1:$v1, v2:$v2, v3:$v3"
    }
    println(method1(123.22,23.5f,12))

    val method2 = {
        345.56f
    }
    println(method2())

    val method3 = { number: Int ->
        number
    }
    println(method3(22))

}