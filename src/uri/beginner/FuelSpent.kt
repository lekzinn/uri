package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1017
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val spentTime = scan.nextInt()
    val averageSpeed = scan.nextInt()

    val liters = (spentTime * averageSpeed) / 12.0
    println("%.3f".format(liters))
}