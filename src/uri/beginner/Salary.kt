package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1008
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val number = scan.nextInt()
    val workedHours = scan.nextInt()
    val workedhouramount = scan.nextDouble()

    val employeeSalary = workedHours * workedhouramount

    println("NUMBER = $number")
    println("SALARY = U$ %.2f".format(employeeSalary))
}