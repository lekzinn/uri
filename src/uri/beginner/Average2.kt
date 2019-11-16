package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1006
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val gradeWeightA = 2.0
    val gradeWeightB = 3.0
    val gradeWeightC = 5.0

    val a = scan.nextDouble()
    val b = scan.nextDouble()
    val c = scan.nextDouble()

    val result = ((a * gradeWeightA) + (b * gradeWeightB) + (c * gradeWeightC)) / 10.0
    println("MEDIA = %.1f".format(result))
}