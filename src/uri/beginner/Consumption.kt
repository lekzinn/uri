package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1014
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val distance = scan.nextInt()
    val spentFuelTotal = scan.nextDouble()

    var averageConsumption = distance / spentFuelTotal

    println("%.3f km/l".format(averageConsumption))
}