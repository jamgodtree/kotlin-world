package books

// リテラル表現

fun main() {
    //数字リテラル
    var i = 123
    var j = 0xFF_FF_FF //16777215
    println(i)
    println(j)

    val num = 108
    println(num::class) // int

    var num1 = 108L
    var num2 = 108F
    println(num1) // 108  Long
    println(num2) //  108.0 Float

    /**
     * Raw String = 任意の文字を含められる文字列
     * \n等エスケープシーケンスを用いずに表現できる
     * '|' は行頭のインデックスを除去してくれる
     * '!' で区切り文字とする等が可能
     *
     * 【実行結果】
     *  kotlinはことりんと読みます
     *jetBrainsが開発した言語になります。
     *Android studio3でサポートされています
     **/

    var msg1 = """
        kotlinはことりんと読みます
        |jetBrainsが開発した言語になります。
        !Android studio3でサポートされています
    """.trimMargin("!")
    println(msg1)

    // 文字列テンプレート
    var value = 10
    var data = arrayOf(100, 200 ,300)

    println("変数valueは、${value}です。") //10
    println("変数valueは、$value です。") //10 変数のあとに空白が必要
    println("配列の末尾は、${data[2]}です。") //300
    println("配列の末尾は、$data[2]です。") //[Ljava.lang.Integer;@c038203[2]
    println("配列のサイズは ${data.size}です。") // 3
    println("10×20は、${10 * 20}です。") //200
}