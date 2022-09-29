package com.art.dokotlin.chapter3

/**
 * Description: TODO 38.Kotlin 非空断言操作符
 * Conclusion: 除非能够保证对象一定不为空，才能使用断言符 !!，否则会有空指针异常的风险
 */

fun main(){
    var name: String? = null // name 是可空类型，如要使用则必须给出补救措施

    val rr = name!!.capitalize(); // !! 表示不管 name 是不是 null 都执行，和 Java 一样
    println(rr)
}