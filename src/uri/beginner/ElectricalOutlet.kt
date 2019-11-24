package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1930
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var T1 = scan.nextInt()
    var T2 = scan.nextInt()
    var T3 = scan.nextInt()
    var T4 = scan.nextInt()
    T1--
    T2--
    T3--
    val maximumDevices = T1 + T2 + T3 + T4

    println(maximumDevices)
}