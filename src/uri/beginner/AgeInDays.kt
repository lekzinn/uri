package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1020
fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var days = scan.nextInt()

    val years = days / 365
    days %= 365
    println("$years ano(s)")
    val months = days / 30
    days %= 30
    println("$months mes(es)")
    println("$days dia(s)")
}