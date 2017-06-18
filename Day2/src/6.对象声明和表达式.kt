/**
 * 有时候只是要对某个类进行轻微改造,供临时使用,避免继承
 * 对象声明和表达式就很有用.
 *
 */

// 对中国人这个类来说, 可能各省人适合继承
open class Chinese(var name: String) {
    open val skin = "yellow"
}

fun main(args: Array<String>) {
    // 但如果是外国人入籍, 就不适合用"继承"
    // 对象表达式: val 对象名 = object: 类, 接口 { //属性或方法override定义 }
    val baako = object : Chinese("Baako Zaid") {
        override val skin = "black"
    }
    println(baako.skin)

    //纯对象表达式: 临时使用,无须继承任何类
    val tempPoint = object {
        var x = 1
        var y = 2
    }
    println(tempPoint.y)

    //相当于调用函数
    NetworkRequestManager.register()

    //与类关联性强
    IDCard.create()
}


//对象声明. 不能用在函数中.
//一般用于对其他类的一种包装
object NetworkRequestManager{
    fun register() {
        println("连接网络注册中.")
    }
}

//伴生对象: 一般用于创建一个类的实例的"工厂"方法
//可用于与Java的静态成员互操作
class IDCard {
    companion object {
        fun create() = IDCard()
    }
}

