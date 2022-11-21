## 字符串替换

str.replace 会返回一个新字符串

```kotlin
val srcPwd = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
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
// newPwd：1B2DEFGH3JKLMNOPQR4TUVWXYZ
```



## == 与 ===

== 是内容或值得比较，相当于Java中 equals 方法；=== 是引用的比较。注意字符串常量池的情况，它存在于内存中的方法区。

```kotlin
// 定义字符串
val name1 = "Auri2022"
val name2 = "Auri2022"
val name3 = "RiseUp"

// 引用比较
println(name1 === name2) // true 字符串常量池中 Auri2022 只有一份 name1 与 name2 都指向它
println(name1 === name3) // false

val name4 = "auri2022".capitalize() // 修改成 Auri2022
println(name4 == name1) // true
println(name4 === name1) // false
```

```kotlin
// 内容或值得比较
println(name1.equals(name2)) // java
println(name1 == name2) // kt
```



## 字符串遍历

```kotlin
val str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
str.forEach {
    // c -> 用 c 来替代 it，相当于修改参数名称
    // it 代表 str 当前遍历到的一个字符
    print("char:$it ")
    // char:A char:B ... char:Z 
}
```



## 字符串转数字类型

尽量用 **toIntOrNull** 函数

```kotlin
// .toInt() 与 .toInt(10) 运行逻辑一致
val number: Int = "333".toInt() // 结果：333
val number2 = "333.3".toInt() // NumberFormatException
```

```kotlin
// .toIntOrNull() 与 .toIntOrNull(10) 运行逻辑一致
val number4: Int? = "666.6".toIntOrNull() // null
// 搭配 “空合并” 操作符
val number5: Int? = "777.77".toIntOrNull()
println(number5 ?: "原来是null")
```

