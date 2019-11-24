package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1142
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val numberLines = scan.nextInt()
    var first = 1
    var second = 2
    var third = 3

    for (x in 0 until numberLines) {
        print("$first $second $third ")
        println("PUM")
        first += 4
        second += 4
        third += 4
    }
}