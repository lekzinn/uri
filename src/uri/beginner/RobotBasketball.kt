package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/2780
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val value = scan.nextInt()

    if (value <= 800) println("1")
    if (value in 801..1400) println("2")
    if (value > 1400) println("3")
}