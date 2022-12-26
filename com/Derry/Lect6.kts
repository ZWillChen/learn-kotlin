//Lecture6 函数引用

fun main() {
    //双冒号引用函数作为参数传入- 具名函数
    login("Derry", "Pwd", ::methodResponseResult)

    //或者利用变量
    val obj = ::methodResponseResult
    login("Derry", "123456", obj)

    //同理 函数的返回值也可以是函数
    val bean = returnObject()
    // 注意 这里bean是个函数，调用的时候要传入参数 否则会打印bean的返回值类型
    println(bean(18, "lty1221"))

}
main()

inline fun login(user: String, pwd: String, responseResult: (String, Int) -> Unit) {
    val username = "Derry"
    val pass = "Pwd"
    if (user == username && pwd == pass) {
        responseResult("success", 200)
    } else {
        responseResult("fail", 500)
    }
}

fun methodResponseResult(msg: String, code: Int) {
    println("最终登陆的结果是:msg $msg, code $code")
}

fun returnObject(): (Int, String) -> String {
    val name = "Derry"
    return { age: Int, name: String ->
        "返回了一个对象，age是$age, name是$name"
    }
}
