package com.art.dokotlin.chapter3

/**
 * Description: TODO 39.Kotlin 使用if判断null
 * Conclusion: 和 Java 一样，可以使用 if else 语句处理可能为 null 的情况
 */

fun main() {
    var name: String? = null // name 是可空类型，如要使用则必须给出补救措施
    name = "ccAutumnRiver{}"
    if(name == null){
        println("name is null")
    }else{
        println(name.capitalize())
    }
}