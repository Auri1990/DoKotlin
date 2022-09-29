package com.art.dokotlin.chapter3

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 35.Kotlin 可空性特点
 */

fun main(){
    // 默认是不可空类型，不能赋值 null
    var name : String = "Auri"
//    name = null 编译报错

    // 加 ？表示这是可空类型
    var name2 : String ?
    name2 = null
    name2 = "Auri2"
}