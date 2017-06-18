/**
 * 枚举类: 有限个类型的列举.
 * 其中的每一个称之为枚举常量(可带初始值), 每一个以逗号分隔
 */

//扑克牌花色
enum class CardCate {
    红心,方片,梅花,黑桃
}

//衣服尺码: 带构造器的枚举类
enum class Size(val height:Int) {
    S(150), M(160), L(170), XL(180), XXL(190)
}

fun main(args: Array<String>) {

    //列举枚举类的常量
    println(CardCate.values().joinToString())

    //枚举常量的名称和序号属性,用name和ordinal表示
    println(Size.valueOf("XXL").name)
    println(Size.valueOf("XXL").ordinal)

    //带构造器的枚举类, 可像普通类那样访问其属性
    println(Size.values().joinToString { it.name + ":" + it.height })
}

