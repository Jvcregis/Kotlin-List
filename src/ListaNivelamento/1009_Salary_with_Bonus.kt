package ListaNivelamento

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.useLocale(Locale.US)

    val name = scanner.nextLine()

    val salary = scanner.nextDouble()

    val valueSold = scanner.nextDouble()

    val extraSalary = valueSold * 0.15

    val totalSalary = salary + extraSalary

    println("TOTAL = R$ %.2f".format(totalSalary))
}