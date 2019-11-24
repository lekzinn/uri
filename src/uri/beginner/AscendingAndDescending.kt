package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1113
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    while (true) {
        val x = scan.nextInt()
        val y = scan.nextInt()

        if (x == y) break

        val result = if (x > y) {
            "Decrescente"
        } else {
            "Crescente"
        }

        println(result)
    }
}

