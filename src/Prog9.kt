package KotlinBase

fun main()
{
    println("введите ваше число")
    val number = readln().toIntOrNull()
    if (number == null)
    {
        println("введено некорректное значение")
    } else {
        if (number % 2 == 0)
        {
            println("число явл чет")
        } else {
            println("число явл неч")
        }
    }
}