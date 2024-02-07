import kotlin.math.min
import kotlin.math.max
import kotlin.math.pow
fun main(){
    try
    {
        var x = readLine()!!.toDouble()
        var y = readLine()!!.toDouble()

        var z = max(x,y) + 0.5/1+max(x,y).pow(2)

        when
        {
            (x<0) -> z = max(x,y)
            (x>=0) -> z = min(x,y)
            (y >= 0) -> z = min(x,y)
            (y < 0) -> z = (max(x.pow(2),y.pow(2)))
        }
        println(z);
    }
    catch (e:Exception)
    {
        println("Ошибка.")
    }
}