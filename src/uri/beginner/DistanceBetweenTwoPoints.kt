package uri.beginner

import java.util.*
import kotlin.math.absoluteValue
import kotlin.math.hypot

// https://www.urionlinejudge.com.br/judge/en/problems/view/1017
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x1 = scan.nextDouble()
    val y1 = scan.nextDouble()
    val x2 = scan.nextDouble()
    val y2 = scan.nextDouble()


    val ac = (y2 - y1).absoluteValue
    val cb = (x2 - x1).absoluteValue
    val distance = hypot(ac, cb)
    println("%.4f".format(distance))
}