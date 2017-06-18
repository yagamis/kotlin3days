/**
 * 用来检查和运算各种条件和逻辑的组合,控制App的运行流向.
 * 循环: for , while 及 循环控制
 * if: 二元判断
 * when: 细致化判断
 */
fun main(args: Array<String>) {
    //for : ①依次操作一个序列(如集合类型)中的每一项, 执行次数是可预测的
    val numbers = arrayOf(1,2,3,4)
//    for (number in numbers) {
//        if (number == 3) continue
//        println(number)
//    }

    //      ②重复执行 : for (a in 1..10) {//操作}
//    for (gg in 1..100) {
//        println("重要的事说100遍")
//        println("学习最重要")
//    }
    

    //while: 循环执行一系列操作,直到条件不成立. 适合执行次数未知的场合
    //Q:1加到多少次,才能加到5050呢?
    var number = 1
    var times = 0
    var total = 0

    while (total < 15050) {
        total += number
        number += 1
        times += 1
        if (total == 5050) break
    }

//    println(times)

    //循环中的控制: continue 结束本次循环, break 结束整个循环


    //if: 条件判断语句, 整个语句本身是一个表达式(可用于简单的二元判断计算)
    val a = 5
    val b = 10
    val result =  if (a > b) "大于" else b - a

//    println(result)

    //when: 可对某个变量的大小/范围/值表达式/类型等进行判断
    when (result) {
//        in 1..5 -> {
//            println("1到5之间")
//        }
        1,3,5 -> {
            println("1,3,5")
        }
//        (9 - 6) -> {
//            println("值是3")
//        }
        is Int -> {
            println("值是Int型")
        }

        else -> {
            println("值是String型")
        }
    }

}






