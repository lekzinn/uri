package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1007
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()
    val d = scan.nextInt()

    val result = (a * b) - (c * d)
    println("DIFERENCA = $result")
}