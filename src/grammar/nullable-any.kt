package grammar

fun main() {
  val i: Int = 200
  val j: Int = i
  val k: Int? = null
//  val l: Int = k Nullable は非Nullへの代入不可

  println(i == j)//結果：true
  println(i === j)//結果：true
// Int→Int?の代入（参照先が変化）
  println(i == k)//結果：true
  println(i === k)//結果：false

// safe call；Nullable型がnullでない場合のみ値にアクセス
  val l: String? = k?.toString()
  println(l)

// smart cast with if
  if (k != null) {
    println(k.toString()) //safe call しなくてもif文中ではIntとして扱える（?がいらない）
  }

  println(k ?: 0) //nullなら0を返す

  // non null cast
  var str: String? = "aefe"
  println(str!!.length) //nullでないことが明らかな場合のみ使う
}