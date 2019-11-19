package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1010
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)


    scan.nextInt() // only for code
    val unitsProductOne = scan.nextInt()
    val unitPriceProductOne = scan.nextDouble()
    scan.nextInt() // only for code
    val unitsProductTwo = scan.nextInt()
    val unitPriceProductTwo = scan.nextDouble()

    val total = (unitPriceProductOne * unitsProductOne) + (unitPriceProductTwo * unitsProductTwo)

    println("VALOR A PAGAR: R\$ %.2f".format(total))
}