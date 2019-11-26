package uri.beginner


import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1177
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val index = scan.nextInt()

    for (x in 0 until  1000) {
        val result = x % index
        println("N[$x] = $result")
    }

}