package KotlinBase

fun main()
{
    println("введите число для обратного отсчета :D")
    val num = readln().toInt()
    if (num <= 0)
    {
        println("значение должно быть положительным ;(")
        return
    }
    for (i in num downTo  1)
    {
        println("обратный отсчет ;Р $i")
    }
    println ("ВЗРЫВ")
}
