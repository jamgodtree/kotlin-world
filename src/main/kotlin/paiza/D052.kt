package paiza

fun main() {
    val n = readLine()!!.toIntOrNull()
    var result: Int = 0

    if (n != null && n in 1..100) {
        for (i in 1..n) {
            result += i
        }
        println(result)
    } else {
        println("1 ≦ N ≦ 100の間で登録してください")
    }
}
