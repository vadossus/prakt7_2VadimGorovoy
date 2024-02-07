import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    println("Введите A,B,C: ")
    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()
    var c = readLine()!!.toDouble()

    if (a == 0.0 || b == 0.0 || c == 0.0)
    {
        println("одно из переменных имеет ноль")
    }
    else
    {
        val d = b.pow(2) - 4 * a * c

        if (d > 0) {
            val x1 = (-b + sqrt(d)) / (2 * a)
            val x2 = (-b - sqrt(d)) / (2 * a)
            println("уравнение имеет два корня: $x1, $x2")
        }
        else if (d == 0.0)
        {
            val x = -b / (2 * a)
            println("уравнение имеет один  корень: $x")
        }
        else
        {
            println("уравнение не имеет корней")
        }
    }
}