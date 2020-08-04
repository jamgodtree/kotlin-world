package books

// 型変換

fun main() {
    // int(狭い型)→Long(広い型)への変換はできない
    var x = 100; // 無印のリテラル = Int(整数), Double(小数点)
    //var y: Long = x; // Error (inferred type is Int but Long was expected)
    //var m: Double = 13; // Error (inferred type is Int but Double was expected)
    var m: Double = 13.0;
    //var n: Float = 1.5f;  // Error (inferred type is Int but Float was expected)
    var n: Float = 1.5f;

    println(x)
    println(m)
    println(n)

    // 異なる型に変数を代入する場合、toXXXXで明示的に変換が必要
    var i = 10
    var j: Long = i.toLong();
    println(j)
}