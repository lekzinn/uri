package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1144
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val N = scan.nextInt()
    for (x in 1..N) {
        val a = x
        val b = x * x
        val c = x * x * x
        println("$a $b $c")
        println("$a ${b+1} ${c+1}")
    }
}