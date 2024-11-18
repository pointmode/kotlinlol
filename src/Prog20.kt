package KotlinBase

fun main()
{
    println("введите элементы списка через запятую:")
    val input = readln()
    val items = input.split(",").map { it.trim() } //разделяем строку запятой и создаем список
    val itemCountMap = items.groupingBy { it }.eachCount() //создание map, подсчитывая кол-во вхождений каждого эл-та
    println("результат:")
    for ((item, count) in itemCountMap)
    {
        println("$item - $count")
    }
}