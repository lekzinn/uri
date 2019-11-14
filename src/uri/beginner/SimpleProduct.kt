package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1004
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val a = scan.nextInt()
    val b= scan.nextInt()

    val result = a * b
    println("PROD = $result")
}