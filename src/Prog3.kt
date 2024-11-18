package KotlinBase

fun main()
{
    val word = "maxim"
    val unicode = word.codePointAt(0) // ф-ция, переводит слово в unicode
    println("Ваше слово в Unicode: '$word' = $unicode")

    val number = "45"
    val decode = number.toInt() //ф-ция, переводит число в unicode
    println("Ваше число в Unicode: '$number' = $decode")
}