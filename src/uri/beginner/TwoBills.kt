package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/2140
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val trick = arrayListOf(7, 12, 22, 52, 102, 15, 25, 55, 105, 30, 60, 110, 70, 120, 150)

    while (true) {
        val buyPrice = scan.nextInt()
        val pricePaid = scan.nextInt()
        if (buyPrice == 0 && pricePaid == 0) break

        val net = pricePaid - buyPrice
        if (trick.contains(net)) println("possible") else println("impossible")
    }

}