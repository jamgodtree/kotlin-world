package paiza

fun main(arg: Array<String>) {
    val n = readLine()!!.toIntOrNull()

    if ( n != null && n in 1..100 ) {
        repeat (n) {
            print("*")
        }
    }
}