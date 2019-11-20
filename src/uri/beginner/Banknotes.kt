package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1018
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var value = scan.nextInt()

    println(value)
    var minimumNotes = value / 100
    value %= 100
    println("$minimumNotes nota(s) de R\$ 100,00")
    minimumNotes = value / 50
    value %= 50
    println("$minimumNotes nota(s) de R\$ 50,00")
    minimumNotes = value / 20
    value %= 20
    println("$minimumNotes nota(s) de R\$ 20,00")
    minimumNotes = value / 10
    value %= 10
    println("$minimumNotes nota(s) de R\$ 10,00")
    minimumNotes = value / 5
    value %= 5
    println("$minimumNotes nota(s) de R\$ 5,00")
    minimumNotes = value / 2
    value %= 2
    println("$minimumNotes nota(s) de R\$ 2,00")
    println("$value nota(s) de R\$ 1,00")
}