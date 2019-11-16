package uri.mathematics

import java.util.*

tailrec fun mdc(a: Int, b: Int): Int {
    return if (b == 0) {
        a
    } else {
        mdc(b, a % b)
    }
}

// https://www.urionlinejudge.com.br/judge/en/problems/view/1028
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val numberOfTests = scan.nextInt()
    for (x in 0 until numberOfTests) {
        val numberOfCards1 = scan.nextInt()
        val numberOfCards2 = scan.nextInt()

        val result = mdc(numberOfCards1, numberOfCards2)
        println(result)
    }

}