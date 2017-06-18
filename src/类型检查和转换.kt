/**
 * 检查:对一个变量的类型进行辨别.
 * 转换:把变量转换成其他类型使用
 */

fun main(args: Array<String>) {
    val a = 5
    val b = 6

    val c = if (a > b) "大于" else  a - b

    //类型判断: is
    if (c is String) {
        println(c.length)
    } else {
        println("整数: $c ")
    }

    if (c !is String) println("整数: $c ")


    //Kotlin编译器大多数时候回智能转换
    if (c is Int) println(c.inc())

    //手动转换:  强制转换as, 安全转换 as?
    val d = c as Int
    println("d是c强制转换后的c,值是$d")

    val e = c as? String
    println(e)

}