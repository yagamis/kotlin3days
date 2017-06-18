/**
 * 扩展：对既有的类增加新功能而无需继承该类，即便无法获取其源代码
 * 主要作用是"立即"为相关类整体上添加"工具类（Utils）"方法或属性，高效优雅。
 *
 * Kotlin支持：扩展函数，扩展属性。
 *
 * 💡与接受者类中参数、名称都一样的扩展是无效的。
 *   尽量避免与已有的名字重名，如果一定要重名，参数名和类型也要不一样。
 */


// 扩展函数：fun 接受者类型.新扩展函数名(参数列表){//函数实现}
// 1.普通函数扩展：整数的平方
fun Int.square(): Int {
    return this * this
}

// 2.泛型函数扩展：取数字型数组中最大的一个元素
fun <T> Array<T>.biggest() : T
    where T: Number,
        T: Comparable<T> {
    var biggest = this[0]

    for (i in 1..lastIndex) {
        val element = this[i]
        if (element > biggest) {
            biggest = element
        }
    }

    return biggest
}

// 扩展属性：var 接受者类型.新扩展属性名 : 类型
//             get() {}
//             set() {}
// 💡只能扩展组合属性，即只能有get和set形式，不能初始化

// 1.普通属性扩展：整数的下一数
val Int.next: Int
    get() = this + 1

// 2.泛型属性扩展：数字类型的半径对应的面积 πr²
val <T: Number> T.area : Double
        get() = 3.14159 * this.toDouble() * this.toDouble()



fun main(args: Array<String>) {
    println(11.square())
    println(arrayOf(1,2,3).biggest())

    println(3.next)

    println('A'.toByte().area)
}

/**
 * 如果一定要问Kotlin与Swift最大的区别是什么？
 * Swift支持扩展协议，但Kotlin目前不支持。

 * 所以Kotlin中的扩展是静态的，本质上只是单纯为类添加新函数而已。
**/

