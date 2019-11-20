package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1011
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val pi = 3.14159

    val radius = scan.nextDouble()

    val volume = (4 / 3.0) * pi * (radius * radius * radius)
    println("VOLUME = %.3f".format(volume))
}