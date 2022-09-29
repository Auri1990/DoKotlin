package com.art.dokotlin.chapter2

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 34.Kotlin 匿名函数 和 具名函数
 */

fun main(){

    // 匿名函数
    showPersonInfo("lilis",999,'女'){
        println("result -> $it")
    }

    // 具名函数
    showPersonInfo("baal",999,'男',:: showResuleImpl)
}

fun showResuleImpl(result: String){
    println("result -> $result")
}

inline fun showPersonInfo(name: String,age:Int,sex:Char,showResult: (String) -> Unit){
    val str = "name: $name, age: $age, sex: $sex"
    showResult(str)
}