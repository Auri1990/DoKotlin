package com.art.dokotlin.chapter3

/**
 * Description: TODO 45.Kotlin replace 实现简易字符串加解密
 * Conclusion:
 */

fun main() {
    val srcPwd = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("sourcePassword: $srcPwd")

    val newPwd = srcPwd.replace(Regex("[ACIS]")) {
        it.value // 这行代码没有做任何事
        when (it.value) { // 这里相当于遍历每一个字母
            "A" -> "1"
            "C" -> "2"
            "I" -> "3"
            "S" -> "4"
            else -> it.value // 不做变化
        }
    }
    println("newPassword: $newPwd")

    val recoverPwd = newPwd.replace(Regex("[1234]")) {
        when (it.value) {
            "1" -> "A"
            "2" -> "C"
            "3" -> "I"
            "4" -> "S"
            else -> it.value
        }
    }
    println("recoverPassword: $recoverPwd") // dd
}