import kotlin.math.abs

class Triangle(private val a: Point, private val b: Point, private val c: Point) {
    fun isInside(point: Point): Boolean {
        val areaTotal = calculateArea(a, b, c)
        val first = calculateArea(point, b, c)
        val second = calculateArea(a, point, c)
        val third = calculateArea(a, b, point)

        return abs(areaTotal - (first + second + third)) < 1e-9
    }

    private fun calculateArea(point1: Point, point2: Point, point3: Point): Double {
        return 0.5 * abs(point1.x * (point2.y - point3.y) +
                point2.x * (point3.y - point1.y) +
                point3.x * (point1.y - point2.y)
        )
    }
}

fun createPoint(): Point {
    println("Введите координаты точки:")
    val x = readln().toDouble()
    val y = readln().toDouble()
    return Point(x, y)
}

fun createTriangle(): Triangle {
    println("Введите координаты трех вершин треугольника:")
    val a = createPoint()
    val b = createPoint()
    val c = createPoint()
    return Triangle(a, b, c)
}
