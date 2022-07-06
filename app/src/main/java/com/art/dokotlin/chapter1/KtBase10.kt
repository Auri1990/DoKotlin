package com.art.dokotlin.chapter1

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 10.Kotlin 语言的编译时常量
 * 编译时常量只能是常用的基本数据类型：String; Double; Int; Float; Long; Short; Byte; Char; Boolean
 *
 * 为什么"编译时常量"只能在函数之外定义？答：如果在函数内定义，则只能在运行时才能调用函数赋值，就不再是编译时常量了。
 * 结论：在函数之外定义常量，就可以在编译期间初始化了。
 */

const val PI = 3.1415926 // 定义编译时常量

class KtBase10 {
    val a = "info" // 这是 只读类型的变量

    // 错误。修饰符 const 不适用于局部变量
    //    const val PI = 45

}