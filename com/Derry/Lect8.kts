import java.lang.Exception

//Lecture8 异常处理和自定义异常

fun main() {

    try {
        //制造一个exception
        var info: String? = null

        checkException(info)

        println(info!!.length)

    } catch (e: Exception) {
        println("$e")
    }

    try {
        //制造一个exception
        var info2: String? = null
        var bool: Boolean = false
        //内置的一些assert check
        checkNotNull(info2)
        requireNotNull(info2)
        require(bool) //如果是false 会抛出异常

        println(info2!!.length)

    } catch (e: Exception) {
        println("$e")
    }

}
main()

fun checkException(info: String?) {
    info ?: throw CustomException()
}

class CustomException : IllegalArgumentException("非法参数异常")
