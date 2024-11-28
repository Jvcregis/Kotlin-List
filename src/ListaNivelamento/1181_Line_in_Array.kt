package ListaNivelamento

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.useLocale(Locale.US)

    val matrix = Array(12) {Array<Float>(12) { 0.0.toFloat() } }

    val line = scanner.nextLine().toInt()

    val op = scanner.nextLine()

    for (i in 0 until 12) {
        for (j in 0 until 12) {
            val number = scanner.nextFloat()
            scanner.nextLine()

            matrix[i][j] = number
        }
    }

    val result:Float
    if (op[0] == 'S') {
        result = matrix[line].sum()
    } else {
        result = matrix[line].average().toFloat()
    }

    println(result)
}