package KotlinBase

fun main()
{
    println("введите ваше число")
    val num = readln().toIntOrNull()
    if (num == null)
    {
        println("введено некорректное значение")
    } else {
        if (num % 2 == 0)
        {
            println("число явл чет")
        } else {
            println("число явл неч")
        }
    }
}
