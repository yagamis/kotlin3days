/**
 * 检查:对一个变量的类型进行辨别.
 * 转换:把变量转换成其他类型使用
 */
fun main(args: Array<String>) {
    val a = if (5 > 7) "大于3" else 2

    //类型判断: is
    if (a is String) println(a.length)
    if (a !is String) {
        println("整数$a!")
    }

    //Kotlin编译器大多数时候会智能转换
    if (a is Int) println(a.dec())

    // 手动转换
    // 强制转换: as, 安全转换: as?
    val b = a as? String
    println("b是安全转换后的a,值是$b")

    val c = a as Int
    println("c是强制转换后的a,值是$c")

}