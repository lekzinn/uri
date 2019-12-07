package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1164
fun main(args: Array<String>) {
    val perfectNumbers = listOf(6, 28, 496, 8128, 33550336)
    val scan = Scanner(System.`in`)
    val numberOfTests = scan.nextInt()
    for (x in 1..numberOfTests) {
        val number = scan.nextInt()
        if (perfectNumbers.contains(number)) {
            println("$number eh perfeito");
            continue
        }
        println("$number nao eh perfeito")
    }
}