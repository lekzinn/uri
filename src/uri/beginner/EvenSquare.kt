package uri.beginner

import java.util.*
import kotlin.math.pow

// https://www.urionlinejudge.com.br/judge/en/problems/view/1073
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val number = scan.nextInt()

    for (x in 1..number) {
        if (x % 2 == 0) {
            val result = x.toDouble().pow(2).toInt()
            println("$x^2 = $result")
        }
    }
}