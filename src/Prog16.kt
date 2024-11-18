package KotlinBase

fun main()
{
    println("введите длину списка")
    val n = readln().toInt()
    val set = mutableSetOf<String>()
    val list = mutableListOf<String>()

    for (i in 1..n)
    {
        val element = readln()
        if (!set.contains(element))
        {
            set.add(element)
            list.add(element)
        }
    }
    for (element in list)
    {
        println(element)
    }
}