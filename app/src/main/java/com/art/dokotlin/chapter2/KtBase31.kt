package com.art.dokotlin.chapter2

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 31.Kotlin 函数内联
 */

fun main() {
    loginApi1("AutumnRiver", "113456") { msg: String, code: Int ->
        println("最终登录的情况如下：msg:$msg, code:$code")
    }
}

// 模拟 数据库SQLServer
const val USER_NAME_SAVE_DB1 = "AutumnRiver"
const val USER_PWD_SAVE_DB1 = "123456"

// 此函数有使用 lambda 作为参数，建议尽量声明成内联 inline，会有减少开辟新方法、对象损耗的收益
// 如果不使用内联 inline，则编译执行时，调用端会生成多个对象来完成 lambda 的调用（性能损耗）
// 如果使用内联 inline，相当于 c++ #define 宏定义、宏替换，会把代码替换到调用处 ，没有新函数、新对象的开辟，规避损耗
// 登录API 模仿前端
public inline fun loginApi1(userName: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if (userName == null || userPwd == null) {
        TODO("用户名密码不能为 null") // 出现问题 终止程序
    }

    // 模拟校验
    if (userName.length > 3 && userPwd.length > 3) {
        if (webServiceLoginApi1(userName, userPwd)) { // 登录成功
            // 登录成功
            responseResult("login success", 200)
        } else {
            responseResult("login error", 502)
        }
    } else {
        TODO("用户名密码不合规范")
    }
}

// 登录的API 模拟服务器
fun webServiceLoginApi1(name: String, pwd: String): Boolean {
    return name == USER_NAME_SAVE_DB && pwd == USER_PWD_SAVE_DB
}