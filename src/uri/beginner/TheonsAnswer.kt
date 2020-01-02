package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1858
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var persons = scan.nextInt()
    var index = -1;
    var minValue = Int.MAX_VALUE
    for (x in 1..persons) {
        val value = scan.nextInt()
        if (value < minValue) {
            minValue = value
            index = x
        }
    }
    println(index)
}