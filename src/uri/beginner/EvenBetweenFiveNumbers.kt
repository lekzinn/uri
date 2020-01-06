package uri.beginner

import uri.extensions.isEven
import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1065
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)


    var evens = 0
    for (x in 0 until 5) {
        val number = scan.nextInt()
        if (number.isEven()) evens++
    }
    println("$evens valores pares")

}