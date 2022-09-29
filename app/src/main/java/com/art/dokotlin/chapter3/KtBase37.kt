package com.art.dokotlin.chapter3

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 37.Kotlin 中使用带 let 的安全调用
 */
fun main() {
    var name: String? = null
    name = "Auri"

    // name 是可空类型，如果真的是 null，？后面这一段代码不执行，就能避免空指针
    val r = name?.let {
        // it == name 本身
        // 如果能执行到这里，那么 name 一定不为 null
        if (it.isBlank()) {
            "Null"
        } else {
            "[$it]"
        }
    }

    println(r)
}