// 整数が n 個与えられ、2 で割り切れる回数が最小のものの、2 で割り切れる回数を求める問題です。
fun main(args: Array<String>) {
  val inputs = readLine()!!.split(" ").map(String::toInt)
  println(inputs)
  var even_array = emptyArray<Int>()

  for (input in inputs) {
    if (input % 2 != 0) continue
    even_array += input
  }
  println(even_array)
  println(even_array.min())
}