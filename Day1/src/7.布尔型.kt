/**
 * 布尔型: Boolean,
 * 表示逻辑上的"真"或"假"
   只有2个值,true 和 false
 */
fun main(args: Array<String>) {
    var vip  = false
    vip = true

    var 资金充足 = false
    资金充足 = true

    if (vip) {
        print("欢迎vip会员!")
        print("3天学会Kotlin番外篇免费观看!")
    } else {
        print("请考虑充值成vip会员,大大优惠哦")
    }
}

