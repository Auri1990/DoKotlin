## Kotlin 是 Android 第一语言

 

## Kotlin 语言和 JVM 虚拟机

Kotlin 语言		->

Java 语言		   -> 编译环节 -> 产生字节码 -> JVM产生指令对（机器码），操作系统进行命令式执行

Groovy 语言     ->



## 学 Kotlin 重要性

各个语言精华汇聚一身的新时代语言 Kotlin ？

Kotlin 走全栈语言之路



## Kotlin语言的跨平台特性

Kotlin 语言 -> 生成二进制代码 -> run in Windows;Linux;MacOs ...

  

## 07.Kotlin内置数据类型

[Demo](./KtBase07.kt)

```kotlin
/*
    String      字符串
    Char        单字符
    Boolean     true/false
    Int         整型
    Float       单精小数
    Double      双精小数
    List        集合
    Set         无重复元素集合
    Map         键值对集合
 */
```



## 08.Kotlin 语言的只读变量

[Demo](./KtBase08.kt)

var 可读可改； val 不可改只可读



## 09.Kotlin 语言的类型推断

[KtBase09](./KtBase09.kt)

```kotlin
val info : String = "Auri is coding" // String 这里给定类型是可以省略的
val age = 98 // Int
val young = false // Boolean 
```



## 10.Kotlin 语言的编译时常量

[KtBase10.kt](./KtBase10.kt)

```kotlin
/**
 * 编译时常量只能是常用的基本数据类型
 *
 * 为什么"编译时常量"只能在函数之外定义？
 * 答：如果在函数内定义，则只能在运行时才能调用函数赋值，就不再是编译时常量了。
 * 结论：在函数之外定义常量，就可以在编译期间初始化了。
 */

const val PI = 3.1415926 // 定义编译时常量
```



## 11.查看 Kotlin 反编译后的字节码

[KtBase11.kt](./KtBase11.kt)

```
Tools -> Kotlin -> Show Kotlin Bytecode = 查看提供给 JVM 的字节码 -> Decompile = 反编译成 Java
```



## 12.Kotlin 语言的引用类型学习

[KtBase12.kt](./KtBase12.kt)

```kotlin
/**
 * Java 语言有两种数据类型：
 *  基本类型：int double 等等
 *  引用类型：String 等等
 *
 * Kotlin 语言只有一种数据类型
 *  看起来都是引用类型，实际编译器会在 Java 字节码中，修改成 "基本类型"，无需担心运行时的性能的损耗。
 */
```



## 13.Kotlin 语言的 range 表达式

[KtBase13.kt](./KtBase13.kt)

```kotlin
// range 表示范围，从哪里（闭合）到哪里（闭合）
if (number in 0..9) {
    println("不及格且很差")
} else if (number in 10..59) {
    println("不及格")
} else if (number in 60..100) {
    println("合格")
} else if (number !in 0..100) {
    println("分数不在 0 到 100 范围内")
}
```

#### "表达式"与"语句"的区别

Java 的 if 是语句；Kotlin的 if 是表达式，它有"返回值"



## 14.Kotlin 语言的 when 表达式

[KtBase14.kt](./KtBase14.kt)

```kotlin
// 由于有不同类型的返回值，故这里返回 Any
val info = when(date){
    1 -> "一"
    2 -> "二"
    3 -> "三"
    4 -> "四"
    5 -> "五"
    6 -> "六"
    7 -> "七"
    8 -> false
    else -> {
        println("忽略")
    }
}
```



## 15.Kotlin 语言的 String 模板

[KtBase15.kt](./KtBase15.kt)

```kotlin
val garden = "圆明园"
val time = 6
println("天气很好，去${garden}看妹子，玩了$time 钟头") // Kotlin 字符串模版写法
```



## 16.Kotlin 语言的函数头学习

[KtBase16.kt](./KtBase16.kt)

Kotlin 的函数更规范（现有输入，再写输出）



## 17.Kotlin 中函数参数的默认入参

[KtBase17.kt ](./KtBase17.kt)

```kotlin
private fun action01(name: String, age: Int) {
    println("name:$name, age:$age")
}

private fun action02(name: String, age: Int = 18) { // 可以设置入参的默认值
    println("name:$name, age:$age")
}

private fun action03(name: String = "Auri", age: Int = 33) {
    println("name:$name, age:$age")
}
```



## 18.Kotlin 语言的具名函数参数

[KtBase18.kt](./KtBase18.kt)

调用函数时，参数顺序可以打乱



## 19.Kotlin 语言的 Unit 函数特点

[KtBase19.kt](./KtBase19.kt)

Kotlin 用一个单例类 kotlin.Unit 来代替 Java 中的 void 关键字



## 20.Kotlin 语言的 Nothing 类型特点

[KtBase20.kt](./KtBase20.kt)

```kotlin
interface A {
    fun show()
}

class AImpl : A{
    override fun show() {
        // 下面这句话，不是注释提示。执行会终止程序
        TODO("Not yet implemented")
    }
}
```



## 21.Kotlin 语言的反引号函数名特点

[KtBase21.kt](./KtBase21.kt)

```kotlin
// in is 在 Java 中只是普通的函数名，但在 kt 中是关键字，需要使用反引号
```
