/**
    函数是有名字的一段代码块.
    包含参数和返回值(可选) ,参数可以有默认值.
 */
fun add(x: Int, y: Int = 0): Int {
    return x + y
}


fun main(args: Array<String>) {

    //😁F1函数名看文档
    // 调用时可打参数名,可读性更好(但调用Java函数无效)
    val b = add(2)
//    println(b)


//    println(sum(1,2,3,5,100))

    val a = intArrayOf(1,2,3,5,100)
    println(sum(*a))

}

//可变参数修饰符vararg
fun sum(vararg x: Int): Int {
    var total = 0

    for (i in x) {
        total += i
    }

    return total
}