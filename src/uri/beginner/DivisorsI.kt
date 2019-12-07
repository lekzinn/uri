package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1157
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val number = scan.nextInt()
    for (x in 1..number)
        if (number % x == 0) println(x)
}