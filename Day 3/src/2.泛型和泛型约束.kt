/**
 * 让一个类型能被"广泛"使用，即通用化，称之为"泛型"。
 * 一般用于函数的参数类型定义，让函数更通用。
 */

fun main(args: Array<String>) {

    //最常见的例子，print和println函数，几乎可以放任意类型的参数
    println(2)
    println("泛型")
    println(arrayOf("Swift","Kotlin","iOS","Android"))

    //arrayOf创建数组，参数也可以是任意类型
    val a = arrayOf(1,2,3)

    //定义一个泛型函数: <T> ,T代表一个占位符，用尖括号包含
    fun <T> showText(para: T) {
        println(para)
    }

    showText(3)


    // 有时候系统提供的泛型函数很好，
    // 比如求和
//     val sum = arrayOf(1,3,-2).sumBy { it }

    // 但加入小数的数组，却无法求和
    // val sum2 = arrayOf(1,3,-2,2.3).sumByDouble { it }

    //泛型约束：<泛型占位符: 类型>
    // ①比如仅限数字类型
    fun <T: Number> sum(vararg numbers: T) : Double {
        return numbers.sumByDouble { it.toDouble() }
    }

    println(sum(1.0, 2, 3.5, -100, 9999))

    //②多重约束: where语句，各个约束用逗号分隔。写在函数体之前。
    // 例：把数组中大于某个元素（阀值）的部分取出并升序排列。
    // 需满足条件：数字型（有大小），可比较型（能排序）
    fun <T> biggerPart(list: Array<T>, threshold: T): List<T>
            where T : Number, T : Comparable<T>
                   {
            return list.filter { it >= threshold }.sorted()
    }

    val aList = arrayOf(1, 0, 55, 99, 3, 2, 666)

    println(biggerPart(aList,2))

}