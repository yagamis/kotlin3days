/**
 * 类中也可以嵌套其他类
 */

//新闻类
class News2 {
    //默认地区
    private var lang = "cn"

    //新闻分类: 嵌套类. 与主类关系并不十分密切,只是形式上在一起. 类似于主从关系.
    class Category2 {
        var list = arrayOf("推荐","娱乐","科技","美女")

        val listDesc = list.joinToString()
    }

    //内部类:新闻语种. 通常用于不直接对外的类,为主类服务. 比如人的眼睛.
    inner class Lang {
        fun changeRegion(newRegion: String) {
            //内部类可以访问宿主类的属性
            lang = newRegion
            println("现在地区是$newRegion")
        }
    }
}

fun main(args: Array<String>) {
    //中国新闻列表. 嵌套类只需自身实例化,即可使用.
    println(News2.Category2().listDesc)

    //更改新闻地区. 内部类必须依赖主类的实例和自身的实例才能使用
    News2().Lang().changeRegion("us")
}

