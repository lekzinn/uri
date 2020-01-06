package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1049
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val map = mapOf(
        "vertebrado" to mapOf(
            "ave" to mapOf("carnivoro" to "aguia", "onivoro" to "pomba"),
            "mamifero" to mapOf("onivoro" to "homem", "herbivoro" to "vaca")
        ),
        "invertebrado" to mapOf(
            "inseto" to mapOf("hematofago" to "pulga", "herbivoro" to "lagarta"),
            "anelideo" to mapOf("hematofago" to "sanguessuga", "onivoro" to "minhoca")
        )
    )

    val key1 = scan.nextLine()
    val key2 = scan.nextLine()
    val key3 = scan.nextLine()
    var result = map[key1]!![key2]!![key3]
    println(result)
}
