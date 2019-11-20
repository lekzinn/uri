package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1019
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var seconds = scan.nextInt()

    val hours = seconds / 3600
    seconds %= 3600
    val minutes = seconds / 60
    seconds %= 60

    println("$hours:$minutes:$seconds")
}