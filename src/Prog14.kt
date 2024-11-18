package KotlinBase

fun main()
{
    print("введите количество элементов массива: ")
    val size = readln().toInt()
    val array = IntArray(size)
    for (i in 0..< size)
    {
        print("введите элемент ${i + 1}: ")
        array[i] = readln().toInt()
    }
    print("введите число для поиска: ")
    val target = readln().toInt()
    val found = array.contains(target) //ф-ция, для проверки наличия целевого числа в массиве
    println("результат: $found")
}