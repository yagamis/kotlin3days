/**
 * 集合类型 Map : 无序可重复. 类似于"字典"的概念
   主要属性: keys (Set), values
   主要方法:
 */
fun main(args: Array<String>) {

    // mapOf<Key,Value>(Pair(key,value),...)
    // 显式指定类型,可防止初始化值类型的错误
    // 机场:  "PVG","浦东"  "SHA","虹桥"  "HGH", "萧山"
    val airports = mapOf<String, String>(Pair("PVG","浦东国际机场"), Pair("SHA","虹桥"),Pair("HGH", "萧山"))

    //元素计数:size,空否:isEmpty()

    //获取某个key对应的value: get , getOrDefault
//    println(airports.getOrDefault("PVe","不存在此机场代码或未添加!请检查!"))

    //返回所有的key: keys ,所有的value: values



    //转换为可变: toMutableMap



    //mutableMapOf<Key,Value>(Pair(key,value),...)
    val airports2 = airports.toMutableMap()

    //添加或更新: 下标方法 map变量名[key] = value
    airports2["PVG"] = "上海市浦东新区浦东国际机场"
    airports2["DLC"] = "大连市周水子机场"




    //移出元素:remove
    airports2.remove("PVG")

    for (mutableEntry in airports2) {
        println("${mutableEntry.key},${mutableEntry.value}")
    }

}