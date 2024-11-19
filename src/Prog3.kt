package KotlinBase

fun main()
{
    val word = "linadota2"
    val unicode = word.codePointAt(0) // ф-ция, переводит слово в unicode
    println("ваше слово в Unicode: '$word' = $unicode")

    val number = "21"
    val decode = number.toInt() //ф-ция, переводит число в unicode
    println("ваше число в Unicode: '$number' = $decode")
}
