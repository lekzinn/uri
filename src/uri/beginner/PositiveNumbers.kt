package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1060
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var result = 0
    for (x in 0 until 6) {
        val number = scan.nextDouble()
        if (number > 0) result++
    }
    println("$result valores positivos")
}