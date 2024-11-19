package KotlinBase

fun main()
{
    println("введите число:")
    val num = readln().toInt()
    for (i in 1 until num) {
        println(i * 2)
    }
}
