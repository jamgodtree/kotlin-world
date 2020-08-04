package paiza

fun main() {
    val value = readLine()!!
    val prize = readLine()!!.toIntOrNull()

    if (prize != null) {
        if (prize > 1 || prize < 1000) {
            when (value) {
                "chocolate" -> {
                    println(prize * 2)

                }
                "cake" -> {
                    println(prize * 5)

                }
                else -> {
                    println("chocolateかcakeを入力してください")
                }
            }
        } else {
            println("1 ≦ N ≦ 1,000 で入力してください")
        }
    }
}
