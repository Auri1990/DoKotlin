package com.art.dokotlin.chapter3

/**
 * Description: TODO 42.Kotlin 先决条件函数
 * Conclusion:
 */

fun main(){
    var value1: String? = null
    var value2: Boolean = false
    checkNotNull(value1) // java.lang.IllegalStateException: Required value was null.
    requireNotNull(value1) // java.lang.IllegalArgumentException: Required value was null.
    require(value2) // java.lang.IllegalArgumentException: Failed requirement.
}