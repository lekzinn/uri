package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1002
fun main(args: Array<String>) {

    val PI = 3.14159

    val scan = Scanner(System.`in`)

    val radius = scan.nextDouble()

    val result = PI * radius * radius
    println("A=%.4f".format(result))
}