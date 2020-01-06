package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/2168
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var N = scan.nextInt()
    val matrix = mutableListOf<MutableList<Int>>()
    for (x in 0..N) {
        val line = mutableListOf<Int>()
        for (y in 0..N) {
            line.add(scan.nextInt())
        }
        matrix.add(line)
    }

    for (x in 0 until N) {
        var result = ""
        for (y in 0 until N) {
            val cameras = matrix[x][y] + matrix[x][y + 1] + matrix[x + 1][y] + matrix[x + 1][y + 1]
            result += if (cameras >= 2) "S" else "U"
        }
        println(result)
    }
}