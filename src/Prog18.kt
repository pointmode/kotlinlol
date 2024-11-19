package KotlinBase

fun main()
{
    println("введите кол-во элементов 1го мн-ва:")
    val n = readln().toIntOrNull() ?: return
    val firstSet = mutableSetOf<String>()

    println("введите элементы 1го мн-ва (каждый на новой строке):")
    repeat(n)
    {
        val el = readLine()?.trim()
        if (el != null)
        {
            firstSet.add(el)
        }
    }
    println("введите кол-во элементов 2го мн-ва:")
    val m = readln().toIntOrNull() ?: return
    val secondSet = mutableSetOf<String>()

    println("введите элементы 2го мн-ва (каждый на новой строке):")
    repeat(m)
    {
        val el = readLine()?.trim()
        if (el != null)
        {
            secondSet.add(el)
        }
    }
    val commonElements = firstSet.intersect(secondSet) //находим общие эл-ты

    println("общие элементы :D") //выводим рез-тат
    if (commonElements.isNotEmpty())
    {
        for (el in commonElements)
        {
            println(el)
        }
    } else {
        println("нет общих элементов ;(")
    }
}
