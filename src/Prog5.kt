package KotlinBase

fun main()
{
    val lines = mutableListOf<String>() // пустой список для хранения строк
    for (i in 1..5) {
        print("введите $i строку: ") // цикл для ввода строк
        lines.add(readln())
    }
    val union = lines.joinToString(separator = "") //ф-ция для объединения строк, separator задает разделитель между эл-ми
    println("объединенные строки: $union")
}