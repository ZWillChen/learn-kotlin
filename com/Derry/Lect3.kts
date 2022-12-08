//Lecture3.函数

fun main() {

    //函数参数的默认参数
    println(functionA())
    println(functionA(1))
    println(functionA(1,"abc"))
    //具名函数参数
    println(functionA(str = "abc"))
    println(functionA(str = "abc", num = 2))

    //Unit函数
    //Kotlin中的Unit = Java 中的Void
    //区别是Unit是类而不是关键字 可以作为返回值类型
    println()
    println(Unit)

    //Nothing类型
    //val testNothing = -1
    val testNothing = 1
    when(testNothing) {
        //会终止后续执行，抛出一个异常
        -1 -> TODO("不合法的输入")
        else -> {
            println("合法的输入，可以执行逻辑")
        }
    }

    //反引号中函数名特点
    `我是一个中文名字的函数 用反引号引用我`("", 1)
    //用途是 作为测试函数 临时使用函数 或者面对与关键字重复的函数名
    //如java中的in is等

}

//函数默认是public
//函数声明关键字 fun
//函数名 functionA
//函数参数 : 返回类型
fun functionA(num: Int = 0, str: String = "") : Int{
    return num + str.length
}

//返回值为Unit的函数 可以省略返回值类型
fun functionUnit() : Unit{

}

fun `我是一个中文名字的函数 用反引号引用我`(str: String, num: Int) {
    println("传入的参数是: $str 和 $num")
}

main()

