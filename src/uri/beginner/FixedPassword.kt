package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1114
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    while (true) {
        val input = scan.nextInt()
        if (input == 2002) {
            println("Acesso Permitido")
            break;
        }
        println("Senha Invalida")
    }
}