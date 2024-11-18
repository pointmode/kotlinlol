package KotlinBase

fun main()
{
    println("введите ваш возраст:")
    val age = readln().toIntOrNull() // ф-ция, для преобразования строк в числовые значения
    if (age == null) //проверка на ввод пустого значения
    {
        println("введено некорректное значение")
    }
    else if (age < 0)
    {
        println("введено некорректное значение")
    }
    else if (age < 18)
    {
        println("вы несовершеннолетний лол")
    }
    else
    {
        println("вы совершеннолетний, соболезную")
    }
}