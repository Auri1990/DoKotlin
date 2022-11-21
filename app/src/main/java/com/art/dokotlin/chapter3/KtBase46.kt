package com.art.dokotlin.chapter3

/**
 * Description: TODO 46.Kotlin == 与 ===
 * Conclusion: == 是内容或值得比较，相当于Java中 equals 方法；=== 是引用的比较
 */
fun main() {
    val name1 = "Auri2022"
    val name2 = "Auri2022"
    val name3 = "RiseUp"

    println(name1.equals(name2)) // java
    println(name1 == name2) // kt

    // 引用比较
    println(name1 === name2) // true 字符串常量池中 Auri2022 只有一份 name1 与 name2 都指向它
    println(name1 === name3) // false

    //
    val name4 = "auri2022".capitalize() // 修改成 Auri2022
    println(name4 == name1) // true
    println(name4 === name1) // false
}