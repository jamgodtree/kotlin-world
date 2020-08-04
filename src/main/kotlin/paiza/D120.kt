package paiza

fun main() {
    val n = readLine()!!.toIntOrNull()

        if (n in 1..50) {
            if (n != null) {
                println(n * 12)
            }
        } else {
            println("1 ≦ N ≦ 50の間で入力して下さい")
        }
    }

