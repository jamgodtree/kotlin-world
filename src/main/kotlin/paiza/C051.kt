package paiza

fun main(args: Array<String>) {
    val s = readLine()!!.split(" ").map(String::toInt)

    println(s)
    for (i in s.indices) {
        val result = s[0]*10+s[1]+s[2]*10+s[3]
        println(s[0]*10+s[1]+s[2]*10+s[3])

    }
}


