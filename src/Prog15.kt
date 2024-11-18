package KotlinBase

fun main()
{
    print("введите длину массива: ")
    val size = readln().toInt()
    val array = IntArray(size)
    for (i in 0..< size)
    {
        print("введите элемент: ${i + 1}: ")
        array[i] = readln().toInt()
    }
    print("введите длину созданного массива: ")
    val newSize = readln().toInt()
    if (newSize != size)
    {
        println("ошибка: длина созданного массива должна быть такой же, как и исходная длина")
        return
    }
    val newArray = IntArray(newSize)
    for (i in 0..< newSize) //цикл для копирования эл-ов из исх массива в новый массив в обратном порядке
    {
        newArray[i] = array[size - i - 1]
    }
    println("созданный массив: ${newArray.joinToString()}") //ф-ция объединяет элементы коллекции в строку
}