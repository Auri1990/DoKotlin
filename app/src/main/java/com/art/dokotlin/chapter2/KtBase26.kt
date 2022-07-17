package com.art.dokotlin.chapter2

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 26.Kotlin it关键字的特点
 */

fun main(){

    val methodAction : (Int, Int, Int) -> String = { number1, number2, number3 ->
        val theValue = 654
        "$number1, $number2, $number3, $theValue, Auri"
    }

    // methodAction.invoke(1,2,3)
    println(methodAction(33,44,55))

    // 当函数只有一个入参时，自动命名 it
    val methodAction2 : (String) -> String = { "$it Auri"}
    println(methodAction2.invoke("Hello"))

    val methodAction3 : (Double) -> String = {"$it Auri"}
    println(methodAction3(88.99))
}

/* 上述写法 等同于如下写法
fun methodAction (number1 : Int, number2: Int, number3: Int) : String {
    val theValue = 654
    return "$number1, $number2, $number3, $theValue, Auri"
}
 */