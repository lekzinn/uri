package uri.beginner

import uri.extensions.isEven

// https://www.urionlinejudge.com.br/judge/en/problems/view/1059
fun main(args: Array<String>) {
    val range = 1..100
    range.forEach {
        if (it.isEven()) println(it)
    }

}