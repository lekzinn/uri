package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1151
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val fib = scan.nextInt()

    var a = 0;
    var b = 1;
    when (fib) {
        1 -> println("0")
        2 -> println("0 1")
        else -> {
            print("0 1")
            for (x in 2 until  fib) {
                val aux = a + b;
                print(" $aux")
                a = b;
                b = aux;
            }
            println()
        }
    }
}