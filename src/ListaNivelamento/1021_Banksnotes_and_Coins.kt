package ListaNivelamento

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.useLocale(Locale.US)

    var value = scanner.nextFloat()
    scanner.nextLine()

    val notes = listOf(100, 50, 20, 10, 5, 2) //.map { it.toFloat() }

    val coins = listOf(1.0, 0.50, 0.25, 0.10, 0.05, 0.01).map { it.toFloat() }

    println("NOTAS:")
    value *= 100
    for (note in notes) {
        val noteTruncated = note * 100
        val divResult = (value / noteTruncated).toInt()

        value -= divResult * noteTruncated

        println("$divResult nota(s) de R$ $note.00")
    }

    println("MOEDAS:")
    for (coin in coins) {
        val coinTruncated = 100 * coin
        val divResult = (value / (coinTruncated)).toInt()

        value -= divResult * coinTruncated

        println("$divResult moeda(s) de R$ %.2f".format(Locale.US, coin))
    }
}