package uri.strings

import java.util.*


// https://www.urionlinejudge.com.br/judge/en/problems/view/1168
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val ledsNeedsEachValue = mapOf(
        '1' to 2,
        '2' to 5,
        '3' to 5,
        '4' to 4,
        '5' to 5,
        '6' to 6,
        '7' to 3,
        '8' to 7,
        '9' to 6,
        '0' to 6
    );

    val caseOfTests = scan.nextInt()
    scan.nextLine(); // Consume newline left-over
    for (x in 0 until caseOfTests) {
        val value = scan.nextLine()

        val totalLeds = value.sumBy {
            ledsNeedsEachValue[it]!!
        }
        println("$totalLeds leds")
    }
}