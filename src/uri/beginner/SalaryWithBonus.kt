package uri.beginner

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1009
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)


    scan.nextLine()// only for name
    val sellerSalary = scan.nextDouble()
    val sold = scan.nextDouble()


    val total = BigDecimal(sellerSalary + sold * 0.15).setScale(2, RoundingMode.HALF_DOWN)

    println("TOTAL = R\$ %.2f".format(total))
}