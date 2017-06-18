/**
 * 接口 interface：方法、属性或一段功能的"蓝本"
 * 仅仅是规定实现的标准（抽象的）
 *
 * 通常用于对类进行附加功能，可以让类本身保持简洁的定义。
 * 通过实现1个或N个接口的组合，来实现非继承式的功能增强。
 *
 * 生物界的启示1：动物通常大量生长皮毛或者完全光溜溜，但人类基本是裸替状态。
 * 人类通过进化，把皮毛功能剥离，从而实现了着装的自由，与动物极大的区别开。
 * 着装让人类可以在任何气候下保持适宜的体温，而不需要靠遗传来维持体温。
 *
 * 启示2：猛兽有尖牙厉爪，可以在捕食大型动物占据优势。但人类基本没有。
 * 人类通过发明类似尖牙厉爪的工具，同时可以轻松捕获大型动物。
 * 人的后代不仅不需要尖牙厉爪就可以得到大象肉，牛肉，鲸鱼肉；
 * 而且人类如此弱体力和弱攻击的物种，居然成了几乎所有动物的噩梦。
 *
 * 这些启示都在明示，继承获得的功能通常是不得已而为之，且进化缓慢，代价高昂。
 * 而在此基础上通过组合各种功能，可以获得强大的能力同时可以轻装上阵。
 *
 */

//接口定义： interface 接口名 {//各种属性或方法定义}

//很多外国人入籍

interface Livable {
    val hasSkill: Boolean
}

interface ChinaLivable {
    //接口中的属性只有类型定义，不可初始化
    val hasJobOffer: Boolean

    //接口中的属性可以有get， 通常用于单纯增加一个常量属性
    val visaCategory: String
        get() = "工作签证"

    //接口中的变量属性
    var city : String

    //接口中的方法
    fun speakChinese()


    //接口中的方法可以有默认实现，通常指该方法是固定不变的。
    fun handleGuanxi() {
        println("我知道在中国要非常注重处理人际关系。")
    }

    var bankDeposite: Int
}

open class Person {
    var name = ""
}

//继承父类，并实现多个接口
class ForigenChinese: Person(), Livable, ChinaLivable {
    override val hasSkill = true

    override val hasJobOffer = true

    override var city = ""

    override fun speakChinese() {
        println("我叫${this.name},我有HSK一级证书，日常工作生活用中文完全无障碍。")
    }

    override var bankDeposite = 100000
}

fun main(args: Array<String>) {
    val tom = ForigenChinese()
    tom.name = "汤格林"
    tom.city = "上海"


    tom.speakChinese()
    tom.handleGuanxi()

    println(tom.visaCategory)
    println(tom.hasSkill)
}