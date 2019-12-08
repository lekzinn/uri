package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1115
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    while (true) {
        val x = scan.nextInt()
        val y = scan.nextInt()
        if (x == 0 || y == 0) return

        if(x > 0 && y > 0) println("primeiro")
        if(x < 0 && y > 0) println("segundo")
        if(x < 0 && y < 0) println("terceiro")
        if(x > 0 && y < 0) println("quarto")
    }
}