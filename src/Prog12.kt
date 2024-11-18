package KotlinBase

fun main()
{
    println("введите число:")
    val number = readln().toInt()
    for (i in 1 until number) {
        println(i * 2)
    }
}