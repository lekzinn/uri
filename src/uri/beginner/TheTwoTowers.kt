package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/2950
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val distance = scan.nextInt()
    val diameterSauron = scan.nextInt()
    val diameterSaruman = scan.nextInt()

    val icm = distance / (diameterSaruman.toDouble() + diameterSauron.toDouble());
    println("%.2f".format(icm))
}