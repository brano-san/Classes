class Point(val x: Double, val y: Double)

fun ex1() {
    try {
        val point = createPoint()
        val triangle = createTriangle()

        val result = if (triangle.isInside(point)) "внутри" else "вне"
        println("Точка находится $result треугольника.")
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }
}

fun ex2(){
    val a = createPoint()
    val b = createPoint()
    println("Расстояние между точками: ${length(a, b)}")
}

fun ex3(){
    println("Введите количество точек: ")
    val count = readln().toInt()
    val list = mutableListOf<Point>()
    for (i in 0..< count){
        list.add(createPoint())
    }

    var min = Double.MAX_VALUE
    var max = Double.MIN_VALUE
    for (i in 0..< count - 1){
        for (j in i + 1..< count){
            val dist = length(list[i], list[j])
            if (dist < min)
                min = dist
            else
                max = dist
        }
    }
    println("Максимальное расстояние: ${max}; Минимальное расстоние: ${min} ")
}

fun main() {
    ex3()
}
