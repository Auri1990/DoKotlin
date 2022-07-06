package com.art.dokotlin.chapter1

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 18.Kotlin 语言的具名函数参数
 *
 * 感觉没啥用
 */

fun main() {
    loginAction(
        age = 33,
        userPwd = "123456",
        nickName = "DDD",
        userName = "Auri",
        phoneNumber = "19900"
    )
}

private fun loginAction(
    userName: String,
    userPwd: String,
    phoneNumber: String,
    age: Int,
    nickName: String
) {
    println("userName:$userName userPwd:$userPwd phoneNumber:$phoneNumber age:$age nickName:$nickName")
}