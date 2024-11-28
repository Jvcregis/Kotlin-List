package ListaNivelamento

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.useLocale(Locale.US)

    while (true) {
        val number = scanner.nextInt()
        scanner.nextLine()

        if (number == 0) break

        for (i in 0..(number-1)) {
            val input = scanner.nextLine()

            val inputSplit = input.split(" ")

            val letterList = inputSplit.map { it.toInt() }

            val max = letterList.filter { it <= 127 }

            if (max.size != 1) {
                println("*")
            }
            else {
                val letter = letterList.indexOf(max[0])
                when (letter) {
                    0 -> println("A")
                    1 -> println("B")
                    2 -> println("C")
                    3 -> println("D")
                    4 -> println("E")
                }
            }
        }
    }
}