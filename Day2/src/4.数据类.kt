/**
 * 数据类:专用于只保存数据的类. 比如用户自动登录信息, 聊天记录等
 * 注意这个保存,并不是指保存到磁盘. 而是转换成文本格式,便于保存.
 * Kotlin中数据类: data class 类名(属性列表)
 *
 */
data class Article(var id: Int, var title:String)

fun main(args: Array<String>) {
    val article1 = Article(8,"Kotlin快速入门 - 开卖了!")

    //数据类的序列化
    println(article1.toString())

    //复制: 生成一个对象的克隆,并更改部分属性
    val article1newTitle = article1.copy(title = "今日开卖 Kotlin快速入门!")

    println(article1newTitle.toString())

    //数据类对象的解构
    val (id, title) = article1
    println("$id,$title")

    //可以用componentN方法来列举属性
    println("${article1.component1()},${article1.component2()}")



}