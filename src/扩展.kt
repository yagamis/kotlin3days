/**
 * 扩展：对既有的类增加新功能而无需继承该类，即时无法获取其源代码。
 * 主要作用是"立即"为相关类整体上添加"工具类（Utils）"方法或属性，高效优雅。
 *
 * Kotlin支持：扩展函数，扩展属性。 扩展协议（可能将来版本支持，Swift中已经实现）
 *
 * 💡与接受者类中参数、名称都一样的扩展是无效的。
 *  尽量避免与已有的名字重名，如果一定要重名，参数名和类型也要不一样。
 */

// 扩展函数: fun 接受者类型.新扩展函数名(参数类别) {//函数实现}
// 1.普通函数扩展: 整数的平方
fun Int.square(): Int {
    return this * this
}

//泛型属性扩展
//1.普通属性扩展。 例子：整数的下一个数字
val Int.next: Int
    get() = this + 1

//2.泛型属性扩展： 数字类型的半径对应的面积: 20.3.area  ，面积πr²
val <T: Number> T.area: Double
    get() = 3.141592 * this.toDouble() * this.toDouble()


fun main(args: Array<String>) {
//    println(-12.square())
    println(3.area)
    println(20.3.area)
    println('B'.toByte().area)

    val a = arrayOf(1,2,3,99,-8734)

    println(a.biggest())
    println(a.smallest())

    println(3.next)
}

// 2.泛型函数扩展： 取数字型数组中最大的元素
fun <T> Array<T>.smallest(): T
        where T: Number,
T: Comparable<T> {
    var smallest = this[0]

    for (i in 1..lastIndex) {
        val element = this[i]

        if (element < smallest) {
            smallest = element
        }
    }
    return  smallest
}

fun <T> Array<T>.biggest(): T
        where T: Number,
              T: Comparable<T> {
    var biggest = this[0]

    for (i in 1..lastIndex) {
        val element = this[i]

        if (element > biggest) {
            biggest = element
        }
    }
    return  biggest
}