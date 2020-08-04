package paiza

fun main() {
    val s = readLine()!!.toList()

   if (s.lastIndex in 1..49) {
        for (i in s.lastIndex downTo 0) {
            print(s[i])
        }
    } else {
        println("1~50文字以内にしてください")
    }
}
