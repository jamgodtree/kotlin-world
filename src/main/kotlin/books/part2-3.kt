package books

// null許容型(Nullable型)

fun main() {
    // var str: String = "Hoge"
    // str = null // Error になる (Null can not be a value of a non-null type String)
    var str: String? = "Hoge"
    str = null

    // int と float も Nullable型ができる
    var intfloat: Int? = 108
    intfloat = null

    println(str) // null
    println(intfloat) //null

    // ボクシング(基本型→ラッパーオブジェクト変換を暗黙的に行う仕組み)
    var ii: Int = 65535
    var jj: Int = ii
    var kk: Int? = ii

    // Int→Intの代入
    println(ii == jj)  // true
    println(ii === jj) // true
    // Int→Int?の代入(異なるオブジェクト)
    println(ii == kk)  // true
    println(ii === kk) // false
    // ==  (同値性)
    // === (同一性) Identity

    // Nullable型→非Null型に代入することはできない。
    var str1: String? = "あいうえお"
    //var str2: String = str1 // Error (Type mismatch: inferred type is String? but String was expected)
    //var str3: Any = str1 // Error (Type mismatch: inferred type is String? but Any was expected)

    // セーフコール演算子(?. nullの場合はnullで返す)
    println(str1?.length) // 5

    var str2: String? = null
    println(str2?.length) // null
    //println(str2.length) // Error(Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?)

    // スマートキャスト
    if (str1 != null) println(str1.length)

    // str1がnullではない場合、文字列長(length)を、str1がnullの場合は0を無条件に返す
    println(str1?.length ?: 0) // 5 or 0

    // !!演算子
    // Nullable型を強制的に変換
    // 明らかにnullではない場合のみに使用するのが望ましい
    println(str1!!.length) // 5
}