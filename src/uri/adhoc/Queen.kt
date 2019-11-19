package uri.adhoc

import java.util.*
import kotlin.math.absoluteValue

fun numberOfMoves(x1: Int, y1: Int, x2: Int, y2: Int): Int {
    if (x1 == x2 && y1 == y2) return 0
    if ((x1 - x2).absoluteValue == (y1 - y2).absoluteValue) return 1;
    if ((x1 == x2) || (y1 == y2)) return 1;
    return 2
}

// https://www.urionlinejudge.com.br/judge/en/problems/view/1087
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    while (true) {
        val x1 = scan.nextInt()
        val y1 = scan.nextInt()
        val x2 = scan.nextInt()
        val y2 = scan.nextInt()

        if ((x1 + y1 + x2 + y2) == 0) break

        println(numberOfMoves(x1, y1, x2, y2))

    }

}