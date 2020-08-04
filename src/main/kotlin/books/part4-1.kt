package books

// 関数

fun main () {
    println(getTriangleArea(5.0,10.0))

    summary("こんにちは、赤ちゃん！")
    summaryUnit("こんにちは、赤ちゃん！")
}

// fun命令関数
fun getTriangleArea(width: Double, height: Double): Double {
    return width * height / 2
}

// 戻り値がない場合は Unit
fun summary(str: String): Unit {
    // 先頭5文字だけ抜き出して、末尾に...を表示させる
    println("${str.substring(0,5)}...")
}

// Unit型であれば例外的に省略が可能
fun summaryUnit(str: String) {
    // 先頭5文字だけ抜き出して、末尾に...を表示させる
    println("${str.substring(0,5)}...")
}

// 単一式関数