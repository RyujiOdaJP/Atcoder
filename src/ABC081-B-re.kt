fun main() {
  val n = readLine()!!.toInt()
  var inputs = readLine()!!.split(" ").map { it.toInt() }
  var repeatNum = 0

  do {
    val isAllEven = inputs.all { it % 2 == 0 }
    if (isAllEven) {
      repeatNum++
      inputs = inputs.map { it / 2 }
    }
  } while (isAllEven)
  println(repeatNum)
}
