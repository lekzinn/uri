package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/2006
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val correctTea = scan.nextInt()

    var correctAnswer = 0
    for (x in 0 until 5) {
        val guest = scan.nextInt()
        if (guest == correctTea) correctAnswer++
    }
    println(correctAnswer)
}