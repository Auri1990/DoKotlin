package com.art.dokotlin.chapter2

/**
 * Created by cheng.qiu on 2022/07/06
 * Description: TODO 29~30.Kotlin 在函数中定义 参数是函数的 函数
 */

fun main() {
    // 写法一
    loginApi("AutumnRiver", "123456", { msg: String, code: Int -> println("登录结果 $msg Code $code") })
    // 写法二
    loginApi("AutumnRiver","123456", responseResult = {msg:String,code:Int ->
        println("最终登录的情况如下：msg:$msg, code:$code")
    })
    // 写法三 由于 responseResult 是最后一个入参，且是匿名函数，故也可以使用如下：
    loginApi("AutumnRiver", "113456") { msg: String, code: Int ->
        println("最终登录的情况如下：msg:$msg, code:$code")
    }
}

// 模拟 数据库SQLServer
const val USER_NAME_SAVE_DB = "AutumnRiver"
const val USER_PWD_SAVE_DB = "123456"

// 登录API 模仿前端
public fun loginApi(userName: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if (userName == null || userPwd == null) {
        TODO("用户名密码不能为 null") // 出现问题 终止程序
    }

    // 模拟校验
    if (userName.length > 3 && userPwd.length > 3) {
        if (webServiceLoginApi(userName, userPwd)) { // 登录成功
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
private fun webServiceLoginApi(name: String, pwd: String): Boolean {
    return name == USER_NAME_SAVE_DB && pwd == USER_PWD_SAVE_DB
}