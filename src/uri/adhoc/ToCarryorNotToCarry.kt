package uri.adhoc

import java.util.*


// https://www.urionlinejudge.com.br/judge/en/problems/view/1026
fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    while (scan.hasNext()) {
        val a = scan.nextInt()
        val b = scan.nextInt()
        println(a xor b)
    }
}