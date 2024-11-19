package KotlinBase

fun main()
{
    println("введите первое множество:")
    val n1 = readln().toInt()
    val set1 = mutableSetOf<String>() //ф-ция, для хранения эл-тов 1 набора

    for (i in 1..n1)
    {
        val el = readln()
        set1.add(el)
    }
    println("введите второе множество:")
    val n2 = readln().toInt()
    val set2 = mutableSetOf<String>()

    for (i in 1..n2)
    {
        val el = readln()
        set2.add(el)
    }
    val union = set1.union(set2) //ф-ия для создания нового набора, содержащего все

    println("объединение: ")
    for (el in union)
    {
        println(el)
    }
}
