package uri.beginner

import java.util.*

// main diagonal: i == j
// secondary diagonal: i + j = 11

// https://www.urionlinejudge.com.br/judge/en/problems/view/1186
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val operation = scan.nextLine()
    val list = mutableListOf<Double>()

    for (i in 0 until 12) {
        for (j in 0 until 12) {
            val value = scan.nextDouble()
            if (i + j >= 12) list.add(value)
        }
    }
    val result = if (operation == "S") {
        list.sum()
    } else {
        list.average()
    }
    println("%.1f".format(result))
}