fun main(){
    try
    {
        println("Введите x и y: ")
        val x = readLine()!!.toDouble()
        val y = readLine()!!.toDouble()
        if (x >= -1.0 && x <= 1.0 && y >= 1.0&& y<=1.0)
        {
            println("Точка принадлежит окружности А")
        }
        else
        {
            println("Точка не принадлежит окружности А")
        }
        if (x >= -0.5 && x <= 0.5 && y >= -2.0 && y<=2.0)
        {
            println("Точка принадлежит окружности B")
        }
        else
        {
            println("Точка не принадлежит окружности B")
        }
        if (x >= -2.0 && x <= 1.0 && y >= -1.0 && y <= 1.0)
        {
            println("Точка принадлежит окружности C")
        }
        else
        {
            println("Точка не принадлежит окружности C")
        }


    }
    catch (e:Exception)
    {
        println("Ошибка")
    }
}