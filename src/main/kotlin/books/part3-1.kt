package books

// 演算子

fun main() {
    val i = 10
    println(if (i == 10) "i is 10" else "i isn't 10")

    // 範囲演算子
    if (i in 1..10) {
        println("iは1~10の範囲に当たります。")
    }

    if (i in arrayOf(5, 10, 15)) {
        println("5,10,15のいずれかどれかに当たります。")
    }

    /** ビット演算子
     *  and (論理積)
     *  or  (論理和)
     *  xor (排他的論理和)
     *  inv (否定)
     *  shl (左シフト)
     *  shr (右シフト[算術])
     *  ushr(右シフト[論理])
     */
    println(10 and 1) //0
    println(10 or 1) //11
    println(10 xor 1) //11
    println(10.inv()) //-11
    println(20 shl 1) //40
    println(20 shr 1) //10
    println(20 ushr 2) //5

    // if
    val x = 108
    if (x == 5) {
        println("変数xは5です。")
    } else if (x == 10) {
        println("変数xは10です。")
    } else {
        println("変数xは5でも10でもありません。")
    }

    // 値を返却できる
    val msg = if (x == 5) {
        "変数xは5です"
    } else if (x == 10) {
        "変数xは10です。"
    } else {
        "変数xは5でも10でもありません。"
    }
    println(msg)

    // when
    val point = 80
    when (point) {
        3 -> {
            println("上級")
        }
        2 -> {
            println("中級")
        }
        else -> println("初級級")
    }

    // when 複数の値も設定可能
    when (point) {
        99, 100 -> println("合格すばらしい")
        in 70..98 -> println("合格")
        in 50..69 -> println("不合格です")
        !in 50..100 -> println("頑張りましょう")
        else -> println("不明瞭な値です")
    }

    // 型による分岐
    val obj: Any = 1.4
    when (obj) {
        is String -> println(obj[0])
        is Int -> println(Math.abs(obj))
        else -> println("?")
    }

    // 引数を取らないwhen命令
    val z = 8
    val y = 12

    when {
        z >= 10 -> println("z=10")
        z < 10 && y > 10 -> println("z<10 && y>10")
        else -> println("その他")
    }

    // 配列 / for命令
    val list = arrayOf("花鳥風月", "山紫水明", "百花乱舞")
    for (item in list) {
        println(item)
    }

    // map / for命令
    //1月=睦月
    //2月=如月
    val map = mapOf("1月" to "睦月", "2月" to "如月")
    for (item in map) {
        println(item)
    }

    // indexと値の双方を取り出す
    //0:花鳥風月
    //1:山紫水明
    //2:百花乱舞
    for ((index, value) in list.withIndex()) {
        println("${index}:${value}")
    }

    // indexのみ取り出したいとき
    for (index in list.indices) {
        println(index)
    }

    // 指定した回数だけ実行するfor文
    // 12345678910
    for (i in 1..10) {
        print(i)
    }
    println()

    // 終了条件を=なしで表現したい場合
    // 123456789
    for (i in 1 until 10) {
        print(i)
    }
    println()

    // デクリメントしたい場合
    // 10987654321
    for (i in 10 downTo 1) {
        print(i)
    }
    println()

    // 増分(減分)の変更
    // 14710
    for (i in 1..10 step 3) {
        print(i)
    }
    println()

    // forのスキップ(continue命令)
    // 50
    var result = 1
    val forlist = listOf(1, 5, 0, 10)
    for (item in forlist) {
        result *= if (item != 0) item else continue
    }
    println(result)

    // forの脱出(break)
    //1,2,3,4,5,6,7,8,9,
    //2,4,6,8,10,12,14,16,18,
    //3,6,9,12,15,18,21,24,27,
    //4,8,12,16,20,24,28,
    //5,10,15,20,25,30,
    //6,12,18,24,30,
    //7,14,21,28,
    //8,16,24,
    //9,18,27,
    for (i in 1..9) {
        for (j in 1..9) {
            if (i * j > 30) {break;}
            print("${i*j},")
        }
        println()
    }

    // forを終了する
    //1,2,3,4,5,6,7,8,9,
    //2,4,6,8,10,12,14,16,18,
    //3,6,9,12,15,18,21,24,27,
    //4,8,12,16,20,24,28,
    outer@ for (i in 1..9) {
        for (j in 1..9) {
            if (i * j > 30) {break@outer;}
            print("${i*j},")
        }
        println()
    }
}