package KotlinBase

fun main()
{
    //словарь с днями недели и их номерами, ф-ция mapOf принимает набор эл-тов, каждый из кот сопоставляется с ключом лол
    val daysOfWeek = mapOf(
        "пн" to 1,
        "вт" to 2,
        "ср" to 3,
        "чт" to 4,
        "пт" to 5,
        "сб" to 6,
        "вс" to 7
    )
    //выведение словаря
    for ((day, number) in daysOfWeek)
    {
        println("$day - $number")
    }
}