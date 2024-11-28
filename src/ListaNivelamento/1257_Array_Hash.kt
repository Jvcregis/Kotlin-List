package ListaNivelamento

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.useLocale(Locale.US)

    val testCases = scanner.nextInt()
    scanner.nextLine()

    val alphabet = ('A'..'Z').toList()

    for (i in 0 until testCases) {
        val linesNumber = scanner.nextInt()
        scanner.nextLine()

        var total = 0
        for (j in 0 until linesNumber) {
            val string = scanner.nextLine()

            for (k in 0 until string.length) {
                val char = string[k]
                val index = alphabet.indexOf(char)
                total += index + j + k
            }
        }

        println(total)
    }
}