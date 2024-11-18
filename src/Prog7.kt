package KotlinBase

fun main()
{
    println("введите символ: ")
    val symbol = readLine()
    if (symbol != null)
    {
        println("длина строки = ${symbol.length}")
    }
    else
    {
        println("введенная строка имеет значение null") //не работет else
    }
}