package algorithm

import Util.isOdd

fun main() {
  val n = readLine()!!.toInt()
  var string = ""

  // +,-を奇数偶数で判別しているとifをO(N)やるはめになる
  // だから+-をループで出力しnが奇数なら+をさいごにつけるというif文をループ外につける

  for (i in 1..n / 2) {
    string += "+-"
  }
  if(n.isOdd()) string += "+"
  println(string)
  println("length: ${string.length}")
}