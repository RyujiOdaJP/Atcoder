/*
N M T
10 2 20 battery, times going cafe, time
9 11 duration time, departure time
13 17 duration time, departure time
.
.
.

*/

fun main () {
//  var remain: Double = 0.0
  var departTime = 0
  val consumptionRate = 0.5
//  var map = mutableMapOf<String, Int>("arrive" to 0, "depart" to 0)
  var list = emptyList<Int>()

  val (a, countGoingCafe, timeToBack) = readLine()!!.split(" ").map(String::toInt)
  var remain: Double = a.toDouble()

  for (i in 1..countGoingCafe) {
    list = readLine()!!.split(" ").map(String::toInt)
    val consumeDuration = (list[0] - departTime) * consumptionRate
    val stayCharge = (list[1] - list[0]) * consumptionRate
    remain = remain + stayCharge - consumeDuration

    departTime = list[1]
    println(remain)
  }

  remain - (timeToBack - departTime) * consumptionRate
  println(remain)
  if (remain <= 0.0) {
    println("No")
    return
  }
  println("Yes")
  return
}




