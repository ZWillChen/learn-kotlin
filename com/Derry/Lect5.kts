//Lecture5 函数使用和内联Inline关键字

fun main() {

    //定义method 同时指定callback的具体实现
    method("Derry", 123456) {
        msg: String, code: Int ->
            println("main中的cb是 $msg, $code")
    }

    //函数调用的其他写法
    method("Derry", 123456, {
        msg:String, code:Int ->
            println("main中的cb是 $msg, $code")
    })

    method("Derry", 123456, callback = {
        msg:String, code:Int ->
            println("main中的cb是 $msg, $code")
    })

    //inline关键字
    //如果函数不使用inline关键字，在调用断，decompile后的代码中会生成多个对象来完成lambda调用
    //这样会造成性能损耗
    //使用了lambda后，是直接copy - paste 匿名函数中的代码行，不会额外创建对象
    //相当于C++中的 #define 宏定义替换
    //没有函数开辟和对象开辟造成的损耗


}
main()

//这个函数有三个参数 str, num 和 一个名字叫callback 的函数
//它本身是一个无返回值函数
//callback也是一个无返回值函数
//此函数使用了lambda作为参数，需要使用内联
inline fun method (str: String, num: Int, callback : (String, Int) -> Unit) {
    if (str.isNullOrBlank()) {
        TODO("empty string")
    } else {
        //这里只是调用了callback 但是callback没有给出具体的实现
        val res = num + 1
        callback(str, res)
    }

}
