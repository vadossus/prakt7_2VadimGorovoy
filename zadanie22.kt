import kotlin.math.*

fun main(){
try {
    println("Введите k,l,m,x")
    var k = readLine()!!.toDouble()
    var l = readLine()!!.toDouble()
    var m = readLine()!!.toDouble()
    var x = readLine()!!.toDouble()

    var y = 0.0
    if (m == min(k,l))
    {
        y = sin(abs(x))/ sqrt(x.pow(2)+1)
    }
    else if (m == max(k,l))
    {
        y = abs(x)* ln((1+x))
    }
    else if (m == min(k,l) && m == max(k,l))
    {
        var num = 10.toDouble()
        y = x.pow(3)+num.pow(-2)
    }
    else
    {
        y = -1.0
    }

    var xY = y.pow(4)-y.pow(2)+5
    println("y(x): $y")
    println("x(y): $xY")

}
catch (e:Exception)
{
    println("Ошибка")
}
}