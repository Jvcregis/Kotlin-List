import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.useLocale(Locale.US)

    val testCases = scanner.nextInt()
    scanner.nextLine()

    val alphabet = ('A'..'Z').toList()

    for (i in 0 until testCases) {
        val string = scanner.nextLine()

        val shift = scanner.nextInt()
        scanner.nextLine()

        var result = ""

        for (char in string) {
            // Obter índice da letra no alfabeto
            val index = alphabet.indexOf(char)

            result += alphabet[(index - shift).mod(26)]
        }

        println(result)
    }
}