package grammar

fun main() {
  println(1 == 1)
  println(1 === 1)

  val i: Int = 200
  val j: Int = i
  val k: Int? = i
//  val l: Int = k Nullable は非Nullへの代入不可

  println(i == j)//結果：true
  println(i === j)//結果：true
// Int→Int?の代入（参照先が変化）
  println(i == k)//結果：true
  println(i === k)//結果：false

  val str1 = "str"
  val str2: String = str1
  val str3: String? = str1

  println(str1 === str2)
  println(str1 === str3)

  // println(i == 10 ? "i is 10" : "i isn't 10") この書き方はできない
  //Yoshihiro Yamada. Quick Master Kotlin: Lets master Kotlin for Android Development Sokushu (Japanese Edition) (Kindle Location 830). WingsProject. Kindle Edition.
  // 参考演算子の変わり
  val intValue = 10
  val string: String
  if (intValue == 100) string = "i is 100" else string = "i is not 100"
  println(string)

  val msg = if (intValue == 10) "x is 10" else "x is not 10"
  println(msg)

  // when else
  // 条件句を抜けるためのbreakは不要default句の代わりにelse句を利用する式として利用できる（例は以下2）条件句は{...}で括る
  // Yoshihiro Yamada. Quick Master Kotlin: Lets master Kotlin for Android Development Sokushu (Japanese Edition) (Kindle Locations 886-888). WingsProject. Kindle Edition.
  val point = 99
  when (point) {
    3,4 -> { //3 or 4
      println("great")
    }
    in 1..2 -> { // 1~2の間
      println("moderate")
    }
    !in 1..4 -> {
      println("fail")
    }
    else -> {
      println("out of range")
    }


  }
}
