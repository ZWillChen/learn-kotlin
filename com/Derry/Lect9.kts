//Lecture9 字符串操作

fun main() {

    val str = "My name is Sakuya Izayoi"

    //substring
    var substr = str.substring(0 until str.length)
    println(substr)

    var index = str.indexOf('S')
    println(index)

    //split
    val jsonText = "Derry,Leo,Lance,Alviss"
    // 自动推断 list: List<String>
    val list = jsonText.split(",")
    println(list)

    val (v1, v2, v3, v4) = list
    println("v1: $v1, v2: $v2, v3: $v3, v4:$v4")

    //replace
    val source = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println(source)

    val encrypted = source.replace()


}
main()
