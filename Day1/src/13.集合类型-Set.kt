/**
 * 集合类型 Set : 无序不重复
   主要方法: 交差并补
 */
fun main(args: Array<String>) {

    // Set<类型> 或 setOf(元素1,元素2,...,元素n),
    // ★大小固定,元素类型不可变

    // 地铁11号线主线: "迪士尼","徐家汇","桃浦新村","南翔","马陆","嘉定新城"
    // 嘉定区支线: "嘉定新城","嘉定西","嘉定北"
    // 江苏昆山支线: "嘉定新城","上海赛车场","安亭","花桥"
    val mainLine = setOf("迪士尼","徐家汇","桃浦新村","南翔","马陆","嘉定新城")
    val sublineJd = setOf("嘉定新城","嘉定西","嘉定北")
    val sublineKs = setOf("嘉定新城","上海赛车场","安亭","花桥")


    //元素计数:count(),空否:isEmpty()

    //检查是否包含某个元素: contains, 包含另一个Set: containsAll
    println(mainLine.containsAll(sublineJd))

    //转化为数组:toTypedArray()


    //集合之间的运算: intersect/subtract/union/minus(补集的被操作对象无须是Set类型)




    //转换为可变: toMutableSet


    //MutableSet<类型>或mutableSetOf(元素1, 元素2, ...,元素n)
    // ★大小可变,类型不可变.
    val mutableMainline = mainLine.union(sublineJd).union(sublineKs).toMutableSet()


    //在末尾增加元素:add方法. 添加另一个集合: addAll方法
    mutableMainline.add("光明路")

    val newsLines = setOf("昌吉东路","上海汽车城")
    mutableMainline.addAll(newsLines)



    //移出元素:remove, 移出另一个集合:removeAll
    mutableMainline.remove("光明路")

    mutableMainline.removeAll(newsLines)
    for (s in mutableMainline) {
        println(s)
    }


}