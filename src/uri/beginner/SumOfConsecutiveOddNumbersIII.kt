package uri.beginner

import uri.extensions.isOdd
import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1158
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val testCases = scan.nextInt()

    for (x in 0 until testCases) {
        val x = scan.nextInt()
        val y = scan.nextInt()
        val oddNumbers = if (x.isOdd()) {
            generateSequence(x) { it + 2 }
        } else {
            generateSequence(x + 1) { it + 2 }
        }
        println(oddNumbers.take(y).sum())
    }
}