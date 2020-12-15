//2 つの整数の積の偶奇を判定する問題です。
fun main(args: Array<String>) {
  val (a, b) = readLine()!!.split(" ").map(String::toInt)
  println(if (a * b % 2 == 0) "Even" else "Odd")
}
