package KotlinBase

fun main()
{
    println("введите ваш возраст:")
    val age = readln().toIntOrNull()
    if (age == 0)
    {
        println("введено некорректное значение :Р")
    } else if (age in 0..12){
        println("вы бейбик")
    } else if (age in 13..17){
        println("вы тинэйджер")
    } else if (age in 18..55){
        println("вы adult")
    } else if (age in 56..120){
        println("вы старик")
    } else {
        println("некорректный возраст")
    }
}
