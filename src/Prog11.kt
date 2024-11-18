package KotlinBase

import java.util.Scanner

fun dayOfWeek(day: Int): String
{
    return when (day)
    {
        1 -> "пн"
        2 -> "вт"
        3 -> "ср"
        4 -> "чт"
        5 -> "пт"
        6 -> "сб"
        7 -> "иисус воскрес"
        else -> "неверный ввод"
    }
}
fun main()
{
    val scanner = Scanner(System.`in`)
    println("введите число от 1 до 7")
    val input = scanner.nextInt()
    val dayWeek = dayOfWeek(input)
    println("день недели: $dayWeek")
}