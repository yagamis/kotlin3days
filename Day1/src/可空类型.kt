/**
 * 可空类型 (据说这个发明价值$1,000,000,000)
 *
 * 代表变量可能没有值的情况
 * 如：用户资料的选填部分，如住址/性别等辅助信息
 * 形式: var 变量 : 类型? ,无值则是null

 */
fun main(args: Array<String>) {
    var addr: String? = "上海师范大学东校区"
    var sex: Boolean?

    if (addr != null) {
        println("您的地址是${addr}")
    }

    sex = false

    if (sex != null && sex == true) {
        print("您是男生")
    } else {
        print("您是女生")
    }

}
