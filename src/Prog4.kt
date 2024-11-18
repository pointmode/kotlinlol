package KotlinBase

fun main()
{
    println("введите символ:")
    val low = readln()[0]
    val up = low.toUpperCase() // ф-ция преобразует указанный символ в верхний регистр с помощью Unicode
    val unicode = up.toInt()
    println("код нового символа: '$up' = $unicode")

}