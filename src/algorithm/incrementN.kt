package algorithm

fun main() {
  val n = readLine()!!.toInt()
  var sum = 0
    for (i in 1 until n) {
      sum += i
      print("$i + ")
    }
  print("$n = ${sum + n}")
}