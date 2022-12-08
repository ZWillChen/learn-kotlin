//Lecture5 函数使用

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


}
main()

//这个函数有三个参数 str, num 和 一个名字叫callback 的函数
//它本身是一个无返回值函数
//callback也是一个无返回值函数
fun method (str: String, num: Int, callback : (String, Int) -> Unit) {
    if (str.isNullOrBlank()) {
        TODO("empty string")
    } else {
        //这里只是调用了callback 但是callback没有给出具体的实现
        val res = num + 1
        callback(str, res)
    }

}
