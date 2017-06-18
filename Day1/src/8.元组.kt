/**
 * 元组(Tuple),给多个变量同时赋值. 分二元(Pair)和三元(Triple)
 */
fun main(args: Array<String>) {
    val 课程 = Triple(3, "学会", "Kotlin")


    val 费用 = Pair("学费",0)
    print("${课程.first}天${课程.second}${课程.third}")
    print(",${费用.first}${费用.second}元!")

}

