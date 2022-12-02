import java.util.*

fun main() {
    val amplititudes  = IntArray(10) { Random().nextInt() }.asList()
    println(amplititudes.sorted() == sort(amplititudes))
}


fun sort(array: List<Int>): List<Int> {
    if (array.count() <= 1) {
        return array
    }

    val pivot = array[0]

    val dropped = array.drop(1)
    val less = dropped.filter { it <= pivot }
    val more = dropped.filter { it > pivot }

    return sort(less) + pivot + sort(more)
}