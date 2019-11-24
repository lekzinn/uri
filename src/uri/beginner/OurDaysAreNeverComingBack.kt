package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1864
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val phrase = "LIFE IS NOT A PROBLEM TO BE SOLVED"
    val numberOfCharacters = scan.nextInt()

    println(phrase.substring(0, numberOfCharacters))
}