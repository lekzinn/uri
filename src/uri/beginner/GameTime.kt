package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1046
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val start = scan.nextInt()
    val finish = scan.nextInt()

    val result = if (start >= finish) {
        24 - (start - finish)
    } else {
        finish - start
    }

    println("O JOGO DUROU $result HORA(S)")
}