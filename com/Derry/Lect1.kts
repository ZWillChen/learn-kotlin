//Lecture1.变量
//注意kts这里是编译不通的 只能定义在top level, named objects 或者 companion objects
//const val PI : Double = 3.1415926
fun main() {
    // var 定义声明变量
    // var 变量名 : 类型 = 值
    var name: String = "Sakuya"
    println(name)
    name = "Izayoi Sakuya"
    println(name)
    //Kotlin 内置数据类型
    /*
    * String    字符串
    * Char      单字符
    * Boolean   布尔
    * Int       整形
    * Double    小数
    * List      元素集合
    * Set       无重复集合
    * Map       键值对
    *
    * */

    //val 定义只读变量
    //val 只读变量名 : 类型 = 值
    val read_only : String = "Read Only Value"
    println(read_only)

    //类型推断
    val str = "string val"
    val num = 123

    //编译时常量 const
    //只能放在函数之外定义 为什么呢?
    //Answer: 如果在函数之内定义，就必须在运行时才能调用赋值，就不会是编译时的常量
//    println(PI)
}

main()