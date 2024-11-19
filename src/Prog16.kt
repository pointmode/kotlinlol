package KotlinBase

fun main()
{
    println("введите длину списка")
    val n = readln().toInt()
    val set = mutableSetOf<String>()
    val list = mutableListOf<String>()

    for (i in 1..n)
    {
        val el = readln() //el = element
        if (!set.contains(el))
        {
            set.add(el)
            list.add(el)
        }
    }
    for (el in list)
    {
        println(el)
    }
}
