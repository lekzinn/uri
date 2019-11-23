package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1149
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val A = scan.nextInt()
    var N = -1

    while (N <= 0) {
        N = scan.nextInt()
    }
    var sum = 0

    for (x in 0 until N) {
        sum += (A + x)
    }
    println(sum)
}