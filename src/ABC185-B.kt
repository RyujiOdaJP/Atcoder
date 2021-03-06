/*
N M T
10 2 20 battery, times going cafe, time
9 11 duration time, departure time
13 17 duration time, departure time
.
.
.

*/

fun main() {
  var departTime = 0
  var list: List<Int>

  val (battery, countGoingCafe, timeToBack) = readLine()!!.split(" ").map(String::toInt)
  var remain: Int = battery

  for (i in 1..countGoingCafe) {
    list = readLine()!!.split(" ").map(String::toInt)
    val consumeDuration = list[0] - departTime
    val stayCharge = list[1] - list[0]

    remain -= consumeDuration //カフェに着くまでの消費

    if (remain <= 0) {
      return println("No") //途中で０になる場合
    }

    remain += stayCharge

    if (remain > battery) {
      remain = battery //容量以上に残量が増えないように処理
    }

    departTime = list[1] //カフェを出る時間の記憶
  }

  remain -= (timeToBack - departTime) //最後のカフェを出てから家までの消費

  if (remain <= 0) {
    return println("No")
  }
  return println("Yes")
}




