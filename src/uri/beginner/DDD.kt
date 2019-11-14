package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1050
fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val mapOfDDDs = mapOf(
        61 to "Brasilia",
        71 to "Salvador",
        11 to "Sao Paulo",
        21 to "Rio de Janeiro",
        32 to "Juiz de Fora",
        19 to "Campinas",
        27 to "Vitoria",
        31 to "Belo Horizonte"
    );

    var ddd = scan.nextInt()

    println(mapOfDDDs[ddd] ?: "DDD nao cadastrado")
}