package uri.beginner

import uri.extensions.isOdd
import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1067
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var cases = scan.nextInt()

    val range = 1..cases
    range.forEach {
        if (it.isOdd()) println(it)
    }
}