package KotlinBase


fun main()
{
    println("введите кол-во элементов 1го мн-ва:")
    val n = readln().toIntOrNull() ?: return
    val firstSet = mutableSetOf<String>()

    println("введите элементы 1го мн-ва (каждый на новой строке):")
    repeat(n)
    {
        val element = readLine()?.trim()
        if (element != null)
        {
            firstSet.add(element)
        }
    }
    println("введите кол-во элементов 2го мн-ва:")
    val m = readln().toIntOrNull() ?: return
    val secondSet = mutableSetOf<String>()

    println("введите элементы 2го мн-ва (каждый на новой строке):")
    repeat(m)
    {
        val element = readLine()?.trim()
        if (element != null)
        {
            secondSet.add(element)
        }
    }
    val commonElements = firstSet.intersect(secondSet) //находим общие эл-ты

    println("общие элементы :D") //выводим рез-тат
    if (commonElements.isNotEmpty())
    {
        for (element in commonElements)
        {
            println(element)
        }
    } else {
        println("нет общих элементов ;(")
    }
}