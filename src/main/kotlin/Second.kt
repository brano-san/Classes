import kotlin.math.pow
import kotlin.math.sqrt

fun length(a : Point, b : Point) : Double {
    return sqrt((a.x-b.x).pow(2)+(a.y-b.y).pow(2))
}