package paiza

fun main() {
    val n = readLine()!!.toInt()
    if (n < 2 || n > 10) {
        return
    }

    val hw = readLine()!!.split(" ").map { it.toInt() }
    hw.forEach {
        if (it < 1 || it > 50) {
            return
        }
    }

    println(hw[0] * hw[1] % n)
}
