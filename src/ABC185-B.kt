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
//  var remain: Double = 0.0
  var departTime = 0
//  val consumptionRate = 0.5
//  var map = mutableMapOf<String, Int>("arrive" to 0, "depart" to 0)
  var list = emptyList<Int>()

  val (battery, countGoingCafe, timeToBack) = readLine()!!.split(" ").map(String::toInt)
  var remain: Int = battery

  for (i in 1..countGoingCafe) {
    list = readLine()!!.split(" ").map(String::toInt)
    val consumeDuration = list[0] - departTime
    val stayCharge = list[1] - list[0]

    remain -= consumeDuration

    if (remain <= 0) {
      return println("No") //途中で０になる場合
    }

    remain += stayCharge

    if (remain > battery) {
      remain = battery
    }

    departTime = list[1]
  }

  remain -= (timeToBack - departTime)

  if (remain <= 0) {
    return println("No")
  }
  return println("Yes")
}




