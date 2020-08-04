package books

// var val

fun main(args: Array<String>) {
    val i = 42
    val s = "すべての答え: $i"

    println("こんにちは、 $s さん")

    val s1 = "1 + 1は ${ 1 + 1 } です。"
    val s2 = "s1の長さは${s1.length}です。"

    println(s2)

    var num1: Int = 108
    num1 = 10
    // num1 = "hoge" //エラー

    // 型推論
    var num2 = 108
    num2 = 10
    // num2 = "hoge" //エラー

    println(num1)
    println(num2)

    // Anyすべての型の可能性がある
    var num3: Any = 108
    num3 = 100
    num3 = "hoge" // エラーにならない

    println(num3)
}