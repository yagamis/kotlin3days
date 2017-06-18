/**
 * 面向对象编程
 * 💡对某种事物进行抽象化,称为"建模(model)",就像提取生物的基因.
 *   一个模型称之为一个类(class), 从而简化认知, 找到规律
 *   特征和属性: 需氧/厌氧, 寿命(多方因素影响)   -- 变量(属性)
 *   功能和行为: 进食,奔跑,睡觉,卖萌,求偶       -- 函数(方法)
 *   繁殖: 继承和多态

     要创造一个具体的生物,必须予以配置参数,即"实例化(instance)"
 */

//快捷定义: class 类名 constructor(属性列表) {更多属性和方法描述}
//构造器: 用来设置类的新实例的出厂配置

open class Chinese2(var sex: Boolean, var region: String) {
    //普通属性, 与变量定义相似
    protected open var skin = "yellow"

    //组合属性,由其他属性计算而来(get)
    val avgLife : Double
        get() {
            when (this.region) {
                "sh" -> {
                    return 82.4
                }
                "ah" -> {
                    return 77.8
                }
                else -> {
                    return 73.4
                }
            }
        }

    //组合属性反过来可以影响其他属性(set,可选), this代表实例
    var avgSalary : Int
        get() {
            when (this.region) {
                "sh" -> {
                    return 4900
                }
                "ah" -> {
                    return 3200
                }
                else -> {
                    return 3500
                }
            }
        }
        set(value) {
            when (value) {
                in 4500..Int.MAX_VALUE -> {
                    this.region = "sh"
                }
                in 2800..3500 -> {
                    this.region = "ah"
                }
                else -> {
                    this.region = "other region"
                }
            }
        }

    //方法: 厨艺
    open fun cook()  {
        val menu = arrayOf("青椒炒肉丝","番茄炒蛋","紫菜蛋汤")

        val desc = menu.reduce{ s1, s2 -> s1 + "," + s2 }
        println("我会${desc}")
    }

}

//类的主要特点: 可以被继承 . 但要标记为开放类(可见性修饰符:open)
//写法: class 子类: 父类, 然后可以用编辑器自动补齐构造器
//子类获得父类所有能力,同时可发展多样性
class Shanghainin2(sex: Boolean, region: String = "sh")
    : Chinese2(sex, region) {
    var dialect = "我港吴侬软语"

    //属性覆盖
    override var skin = "shanghaiYellow"

    protected var city = "Shanghai"
}

//子类方法加成
class Sichuanwa2(sex: Boolean, region: String)
    : Chinese2(sex, region) {
    override fun cook() {
        super.cook()

        val menu = arrayOf("麻婆豆腐","重庆毛血旺","诸葛烤鱼")
        val desc = menu.reduce{ s1, s2 -> s1 + "," + s2 }
        println("我还会${desc}")
    }
}

fun main(args: Array<String>) {
    //实例化一个类
    val xiaoyaoming = Shanghainin2(true)
    xiaoyaoming.avgSalary = 3000
    println(xiaoyaoming.region)
    println(xiaoyaoming.dialect)




    //方法覆盖
    val xiaoguojingming = Sichuanwa2(true,"sc")
    xiaoguojingming.cook()

}
