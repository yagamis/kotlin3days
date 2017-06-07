/**
 * 字符串(String)是有序的字符(Char)集合.
 * 如"菜鸟大战顺丰正酣,邮政局星夜叫停"
 *
 * Kotlin中的String和Char的方法非常丰富
 * 字符串可通过 + 连接
 * 可以往字符串中插入变量创建字符串模板
 *
 */

fun main(args: Array<String>) {

    //包含在一对双引号中间的值,称之为字符串字面量,"3天学会Kotlin"
    var courseName = "3学天会Kotlin"


    //判断字符串为空:isEmpty, 计数count()
//    print(courseName.count())


    //用Char类型来定义字符, 一对单引号包括的值,为字符字面量, 'b',
    //判断是否数字或文字,isDigit,isLetter方法
    val aChar = '我'
    var five = '5'

//    print(five.isDigit())


    //用字符串的toCharArray()方法,把字符串转换为字符数组.

    for (字 in courseName.toCharArray()) {
        println(字)
    }


    //字符串或字符的相连,可以用 +  操作符
    courseName += ('大'  + "暑期" +  '班')

//    print(courseName)



    //字符串模板:可以把各种变量组合成一个动态的字符串
    val eventTime = Triple(6,1,3)
    val company1 = "顺丰"
    val company2 = "菜鸟"
    val admin = "国家邮政局"
    val newsTitle = "${eventTime.first - 1}月${eventTime.second}日," +
            "${company1}大战${company2}正酣," +
            "${eventTime.third}日星夜,${admin}紧急叫停"
    print(newsTitle)

}