package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1175
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val array = arrayListOf<Int>()
    for (x in 0 until 20) {
        val number = scan.nextInt()
        array.add(number)
    }
    array.reverse()
    for (x in 0 until 20)
        println("N[$x] = ${array[x]}")

}