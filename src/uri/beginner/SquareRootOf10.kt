package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/2161
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var times = scan.nextInt()
    var result = 0.0

    while (times-- > 0) {
        result += 6.0
        result = 1.0 / result

    }
    result += 3.0
    println("%.10f".format(result))
}