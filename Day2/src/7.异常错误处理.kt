/**
 * 对可能发生执行异常的代码的一种保护措施
 * 默认异常类: Exception
 */
fun main(args: Array<String>) {

    //直接展示错误
    try {
        val a = "3gg".toInt()
    } catch(e: Exception)  {
        println(e.message)
    }

    //忽略错误
    val a: Int? = try  {
        "3gg".toInt()
    } catch(e: Exception){
        null
    }


    println(a)
}