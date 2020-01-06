package uri.adhoc

import java.util.*


// https://www.urionlinejudge.com.br/judge/en/problems/view/2374
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val desiredPressureByTheDriver = scan.nextInt()
    val pressureReadByThePump = scan.nextInt()
    println(desiredPressureByTheDriver - pressureReadByThePump)

}