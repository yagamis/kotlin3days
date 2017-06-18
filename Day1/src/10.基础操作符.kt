/**
  一个符号或单词,类似数学的 + - * /, 用于运算或者操作.

  同时操作对象的数目,被称之为几元操作符
 */
fun main(args: Array<String>) {
    //操作一个目标, 是一元操作符
    var a = 3
    a = -100
    val b = +a
    var c = -a

//    println("${b},${c}")




    //二元操作符操作2个目标,在2个目标之间,前后用空格分隔
    var d = a + c
//    println(d)







    //赋值操作符,用等号右边的值来更新左边变量的值
    var e = d
//    println(e)







    //数学操作符 : + - * / %
    println(3 + 4)
    println(3 - 4)
    println(3 * 4)
    println(12 / 4.0)
    println(13 % 4.1)






    //赋值与数学操作符的组合,比如 *=
    var gdp = 10_000.0
    var gdpGrowth = 6.7 / 100
    gdp += (gdp * gdpGrowth)
//    println(gdp)

    //等额本金
    val 房产总价 = 150_0000.0
    val 利率 = 4.9 / 100
    val 分期年数 = 30
    val 首付成数 = 0.3

    val 本金 = (房产总价 * (1 - 首付成数)) / (分期年数 * 12)
    var 贷款总金额 = 房产总价 * (1 - 首付成数)

    //每个月要还的利息费用，是当月还没有未还款的贷款 * 月利息，所以是递减的
    val 分期月数列表 = Array(分期年数 * 12, {i -> i + 1})

    val 每个月利息列表 = 分期月数列表.map {
        val 当月利息 = 贷款总金额 * (利率 / 12)
        贷款总金额 -= 本金
        当月利息
    }
    println(每个月利息列表.joinToString())
    val 总花费 = 房产总价  + 每个月利息列表.sum()

    println("${(房产总价 / 1_0000).toInt()}万的房产，" +
            "分期${分期年数}年，月利率${利率 * 100}%，将一共花费${(总花费 / 1_0000).toInt()}万。")



    //比较操作符: > >= < <= . 结果是true或false
    println(1 > 2)
    println(1 >= 2)
    println(1 < 2)
    println(1 <= 2)












    //逻辑操作符 : 布尔值的组合. 与/或/非
    var haveComputer = true
    var netAvailable = true
    var watchXiaoboVideo = true

   if (watchXiaoboVideo) {
       print("学会Kotlin不成问题!")
   } else {
       print("无法学习kotlin!")
   }




}

