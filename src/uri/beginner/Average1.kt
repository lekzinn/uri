package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1005
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val gradeWeightA = 3.5
    val gradeWeightB = 7.5

    val a = scan.nextDouble()
    val b = scan.nextDouble()

    val result = ((a * gradeWeightA) + (b * gradeWeightB)) / 11.0
    println("MEDIA = %.5f".format(result))
}