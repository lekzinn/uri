package uri.beginner

import java.util.*

// https://www.urionlinejudge.com.br/judge/en/problems/view/1012
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val pi = 3.14159

    val a = scan.nextDouble()
    val b = scan.nextDouble()
    val c = scan.nextDouble()

    val areaTriangule = (a * c) / 2
    val areaCircle = c * c * pi
    val areaTrapezium = (a + b) * c * 0.5
    val areaSquare = b * b
    val areaRectangle = a * b
    println("TRIANGULO: %.3f".format(areaTriangule))
    println("CIRCULO: %.3f".format(areaCircle))
    println("TRAPEZIO: %.3f".format(areaTrapezium))
    println("QUADRADO: %.3f".format(areaSquare))
    println("RETANGULO: %.3f".format(areaRectangle))
}