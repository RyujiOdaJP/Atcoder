fun main() {
  val a = readLine()!!.toInt()
  val b = readLine()!!.toInt()
  val c = readLine()!!.toInt()
  val x = readLine()!!.toInt()
  val amount = a * 500 + b * 100 + c * 50

  if (x > amount) return println("0")
  // (1,0,0) (0,1,0) (0,0,1) (1,1,0) (1,0,1)(0,1,1) (1,1,1) (000) (a+b+c)! +
  else divEachCoin(a, b, c, x)


}

fun divEachCoin(a: Int, b: Int, c: Int, x: Int) {
  var remain = x
  if (x >= a * 500) {
    remain %= (a * 500)
    divEachCoin(a, b, c, remain)
  }

}