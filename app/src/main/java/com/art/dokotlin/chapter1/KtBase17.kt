package com.art.dokotlin.chapter1

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO.17 Kotlin 中函数参数的默认入参
 */

fun main(){
    action01("Nav",89)
    action02("Saori")
    action03()
}

private fun action01(name: String, age: Int) {
    println("name:$name, age:$age")
}

private fun action02(name: String, age: Int = 18) { // 可以设置入参的默认值
    println("name:$name, age:$age")
}

private fun action03(name: String = "Auri", age: Int = 33) {
    println("name:$name, age:$age")
}
