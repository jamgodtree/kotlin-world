package paiza

fun main(arg: Array<String>) {
    val n = readLine()!!.toIntOrNull()

    if (n != null && n in 1..100) {
        println(n * 60)
    } else {
        println("1 ≦ n ≦ 100で設定して下さい")
    }
}
