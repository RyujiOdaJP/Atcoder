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
  val const = 0.5
  val list = emptyList<Double>().toMutableList()
  val (battery, times_going_cafe, time_to_back) = readLine()!!.split(" ").map(String::toInt)
  for (i in 0..times_going_cafe) {
    val(duration, depart) = readLine()!!.split(" ").map(String::toInt)
    val charge = (duration - depart) * const
    val remain = battery - charge

    if (c <= 0) {
      println("No")
      return
    }
    list[i] += c

  }
}




