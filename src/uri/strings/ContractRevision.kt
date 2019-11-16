package uri.strings

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1120
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    while (true) {
        val digitFailed = scan.nextInt()
        val originallyNumber = scan.next()

        if (digitFailed == 0 && originallyNumber == "0") {
            break;
        }

        var result = originallyNumber.replace(digitFailed.toString(), "")
        result = result.trimStart('0')
        when (result) {
            "" -> println("0")
            else -> println(result)
        }
    }
}