import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.useLocale(Locale.US)

    while(true) {

        val studentsNumber = scanner.nextInt()
        scanner.nextLine()

        if (studentsNumber == 0) break

        val studentList = Array<Int>(studentsNumber) { 0 }

        for (i in 0 until studentsNumber) {
            val number = scanner.nextInt()

            studentList[i] = number
        }
        scanner.nextLine()

        var begin = scanner.nextInt()
        scanner.nextLine()
        var currStudent = studentList[begin - 1]

        while (true) {
            if (currStudent == begin) {
                println(currStudent)
                break
            }

            begin = currStudent
            currStudent = studentList[begin - 1]
        }
    }
}