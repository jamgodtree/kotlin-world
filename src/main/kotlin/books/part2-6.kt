package books

// 定数

fun main() {
    // 定数の宣言はval(javaのfinalに相当)
    val author = "WINNING SHIORI"
    // author = "やまだたろう" // Error (Val cannot be reassigned)
    println(author)

    val data = arrayOf(1,2,3)
    // data = arrayOf(3,5,7) // 配列の要素そのものを差し替えているのでエラーになる
    // 配列要素の変更なので可
    data[1] = 10
    data.forEach { println(it) }

    // コンパイル時定数
    // const val TITEL = "速読kotlin"
    // println(TITEL)
}
