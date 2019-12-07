package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/2791
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var glass = 0
    for (x in 1..4) {
        val number = scan.nextInt()
        if (number == 1) glass = x
    }
    println(glass)
}