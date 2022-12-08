//Lecture2.表达式
fun main() {
    //range表达式 范围值语法糖
    val score = 98
    if (score in 0..50) {
        println("Failure")
    } else if (score in 51..59) {
        println("Waitlist")
    } else if (score in 60..100) {
        println("Pass")
    } else if (score !in 0..100) {
        println("Illegal")
    }

    //when表达式 -> java 中的switch 但是功能更强大
    val weekday = 5
    val info = when(weekday) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> {
            println("Illegal Input Weekday!")
        }
    }

    //String format 表达式
    val happy = true
    println("今天是星期$weekday($info), ${if (happy) "我今天很开心" else "今天有点难受"}。")
}

main()