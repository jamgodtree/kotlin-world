package books

// 配列

fun main(args: Array<String>) {
    // 配列に格納したい要素を追加
    var data1 = arrayOf(1, 2, 3)

    // プリミティブ型の配列 intArrayOf LongArrayOf ByteArrayOf (ボクシングが発生しない)
    var data2 = intArrayOf(1, 2, 3)

    // 空の配列を作成する arrayOfNulls関数(空なので明示的に型を設定する必要がある)
    var data3: Array<String?> = arrayOfNulls(5)

    // 配列の要素を動的に生成するArrayコンストラクタ
    var data4 = Array(5) { i -> i * 3 }
    var data5 = Array(5, { i -> i * 3 })

    data1.forEach { println(it) }
    data2.forEach { println(it) }
    data3.forEach { println(it) }
    data4.forEach { println(it) }
    data5.forEach { i -> println(i) }

    // 目的特価のコレクション(読み取り専用)
    var list = listOf("あか", "あお", "あい")
    var set = setOf("V", "C", "A", "C", "V")
    var map = mapOf("First" to 1, "Second" to 2, "Third" to 3)

    // list[2] = "てすと" // No set method providing array access

    println(list) // [あか, あお, あい]
    println(set) // [V, C, A]
    println(map) // {First=1, Second=2, Third=3}

    // 変更可能なコレクション
    var mute = mutableListOf("100", "400", "1000")
    mute[2] = "10"
    println(mute) // [100, 400, 10]
}