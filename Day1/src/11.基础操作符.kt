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
//    println(3 + 4)
//    println(3 - 4)
//    println(3 * 4)
//    println(12 / 4.1)
//    println(13 % 4)






    //赋值与数学操作符的组合,比如 *=
    var gdp = 10_000.0
    var gdpGrowth = 6.7 / 100
    gdp += (gdp * gdpGrowth)
//    println(gdp)







    //比较操作符: > >= < <= . 结果是true或false
//    print(1 > 2)
//    print(1 >= 2)
//    print(1 < 2)
//    print(1 <= 2)











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

