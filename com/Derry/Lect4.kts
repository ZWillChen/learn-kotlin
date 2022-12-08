//Lecture3.匿名函数lambda

fun main() {

    var len = "Derry".count()
    println(len) //5

    //这里是一个for each
    var rLen = "Derry".count() {
        it == 'r'
        //iterator count when char == 'r'
    }
    println(rLen) //2

    //声明一个val是一个函数
    //(输入) -> 输出
    val methodAction : () -> String
    //隐式返回
    methodAction = {
        val input = 99
        //return 省略
        "input is : $input "
    }
    println(methodAction())

    //匿名函数参数
    val method : (Int, Int, Int) -> String = {
        a1, a2, a3 ->
        val input = "method方法"
        "$input 接收到的参数是 $a1, $a2, $a3"
    }
    println(method(1,2,3))

    //it关键字
    val methodIt : (String) -> String = {
        "$it Derry"
    }
    println(methodIt("我就是"))
//    println(methodIt("我就是", 1)) //参数如果超过1个，那么就会有异常

    //匿名函数的类型推断 不用在变量处显式定义函数的输入输出类型
    val mtd = {
        v1:Double, v2:String, v3:Int ->
        "v1:$v1, v2:$v2, v3:$v3"
    }
    println(mtd(123.45, "123.45", 123))



}
main()
