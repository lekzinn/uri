package uri.beginner

import java.util.*


fun validateValues(A: Int, B: Int, C: Int, D: Int): Boolean {
    if (!(B > C && D > A)) return false
    if (!(C + D > A + B)) return false
    if (!(C > 0 && D > 0)) return false
    if (!(A % 2 == 0)) return false
    return true
}

// https://www.urionlinejudge.com.br/judge/en/problems/view/1035
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val A = scan.nextInt()
    val B = scan.nextInt()
    val C = scan.nextInt()
    val D = scan.nextInt()

    if (validateValues(A, B, C, D)) {
        println("Valores aceitos")
    } else {
        println("Valores nao aceitos")
    }
}