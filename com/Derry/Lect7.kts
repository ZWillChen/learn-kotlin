//Lecture7 可空性特点

fun main() {

    //默认是不可空类型 不能随意给null
    var name1: String = "Derry"
    //提示: 不能是非空类型String的值
    //name1 = null

    //声明时指定为可空类型
    var name2: String?
    name2 = "Derry"
    name2 = null
    println(name2)

    //安全调用操作符
    var name: String? = "zhangsan"
    name = null
    //name.capitalize() //name是可空类型的 可能是null 想要使用name 必须给出补救措施
    name?.capitalize() //name是可空类型的 如果真的是null .?后面这一段代码不会执行 不会引发npe

    //使用带let的安全调用
    var str: String? = null
    var res = str?.let {
        // it == str 本身
        //如果能够执行到let后面的代码 it一定不为null
        if (it.isBlank()) {
            "default value"
        }
        else {
            "[$it]"
        }
    }
    println(res)

    //断言操作符特点
    var term: String? = "null"
    val r = term!!.capitalize() //!! 不管name是不是null 都执行后面的代码
    println(r) //如果term是null 会引发Npe

    //空合并操作符 foo?:"real retrun"
    var info: String? = "information"
    info = null
    println(info?: "原来你是null")

    //let + 空合并操作符
    println(info?.let { "[$it]" } ?: "是Null时候的打印内容")

}
main()
