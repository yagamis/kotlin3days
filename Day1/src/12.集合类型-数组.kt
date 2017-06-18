/**
 * 集合类型 Collection

    同类型的值的组合, 根据整体特性分:
    1.有序可重复 - Array, 索引从0开始(index, i)
    2.无序不重复 - Set
    3.无序可重复 - Map, 但值有唯一的键(Key)
 */
fun main(args: Array<String>) {

    //Array:  Array<类型> 或 arrayOf(元素1,元素2,...,元素n)
    // ★大小固定,元素类型不可变
    // 地铁11号线: "嘉定北","徐家汇","南翔","桃浦新村","上海西站", "罗山路","迪士尼"
    var no11stations = arrayOf("嘉定北","徐家汇","南翔","桃浦新村","徐家汇","上海西站", "罗山路","迪士尼","徐家汇", "桃浦新村")



    //创建一个有默认值的数组,Array(计数, {默认值})
    var no30stationNamePlaceholders = Array(20, {"临时站名"})



    //创建1到10数组: Array(10, {i -> i + 1})
    //i代表元素的索引值,从0开始.
    var oneToTen = Array(10, { i -> i + 1 })


    //元素计数:count(),空否:isEmpty()


    // 获取其中元素: 数组名[索引] , 首元素:数组名.first, 尾元素: 数组名.last
    // 获取前5个元素的快捷方法 .component1到5
//    println("${oneToTen.component1()},${oneToTen.component2()}")
//    println(oneToTen[10 - 1])


    // 获取筛选重复元素后的数组: .distinct() 或用.toSet()转换为Set.
    val no11StationsNoRepeat = no11stations.toSet()


    // 切割数组: sliceArray
    val no11stationsInNanxiang = no11stations.sliceArray(2..3)


    //mutableList:  MutableList<类型>或mutableListOf(元素1, 元素2, ...,元素n)
    // ★大小可变,类型不可变.
    var no11NewsStations = mutableListOf("嘉定北","徐家汇","南翔","桃浦新村",
            "徐家汇","上海西站", "罗山路","迪士尼","徐家汇",
            "桃浦新村")
    val newStations = arrayOf("嘉定北", "嘉定新城","花桥")


    //在末尾增加元素:add方法. 添加另一个数组addAll方法
    no11NewsStations.add("嘉定北")
    no11NewsStations.addAll(newStations)

    //移出元素remove, 移出指定位置removeAt
    no11NewsStations.removeAll(newStations)


    for (no11NewsStation in no11NewsStations.distinct()) {
        println(no11NewsStation)
    }
}