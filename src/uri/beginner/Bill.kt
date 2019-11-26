package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1866
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val numberOfCases = scan.nextInt()

    for (x in 0 until numberOfCases) {
        val numberOfTerms = scan.nextInt()
        println(numberOfTerms % 2)
    }

}