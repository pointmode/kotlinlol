package KotlinBase

fun main()
{
    println("введите число для обратного отсчета :D")
    val number = readln().toInt()
    if (number <= 0)
    {
        println("значение должно быть положительным ;(")
        return
    }
    for (i in number downTo  1)
    {
        println("обратный отсчет ;Р $i")
    }
    println ("ВЗРЫВ")
}