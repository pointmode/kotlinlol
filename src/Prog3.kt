package KotlinBase

fun main()
{
    val word = "linadota2"
    val unicode = word.codePointAt(0) // ф-ция, переводит слово в unicode
    println("ваше слово в Unicode: '$word' = $unicode")

    val num = "21"
    val decode = num.toInt() //ф-ция, переводит число в unicode
    println("ваше число в Unicode: '$num' = $decode")
}
