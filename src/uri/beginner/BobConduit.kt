package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1589
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var testCases = scan.nextInt()

    for (x in 0 until testCases) {
        var radius1 = scan.nextInt()
        var radius2 = scan.nextInt()
        println(radius1 + radius2)
    }
}