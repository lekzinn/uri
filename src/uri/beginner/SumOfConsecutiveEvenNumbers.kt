package uri.beginner

import uri.extensions.isEven
import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1159
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    while(true){
        val x = scan.nextInt()
        if(x == 0) break

        val evenNumbers = if (x.isEven()) {
            generateSequence(x) { it + 2 }
        } else {
            generateSequence(x + 1) { it + 2 }
        }
        println(evenNumbers.take(5).sum())
    }
}