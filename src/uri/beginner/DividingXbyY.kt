package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1116
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val numberOfTests = scan.nextInt()
    for (x in 0 until numberOfTests) {
        val x = scan.nextInt()
        val y = scan.nextInt()

        if (y == 0) {
            println("divisao impossivel")
            continue
        }

        println("%.1f".format(x.toDouble() / y.toDouble()))
    }
}