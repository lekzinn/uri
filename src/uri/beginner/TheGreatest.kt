package uri.beginner

import java.util.*
import kotlin.math.absoluteValue

// https://www.urionlinejudge.com.br/judge/en/problems/view/1013
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()

    var theGreatest = (a + b + (a - b).absoluteValue) / 2
    theGreatest = (theGreatest + c + (theGreatest - c).absoluteValue) / 2
    println("$theGreatest eh o maior")
}