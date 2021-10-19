package track

fun main() {
  val inputs: List<String> = readLine()?.split(" ") ?: throw IllegalArgumentException("error! ")
  val seed: String = inputs[0]
  val n: Int = inputs[1].toIntOrNull() ?: throw IllegalArgumentException("error! n should be Integer")

  fun askServer(n: Int): Int = 0

  fun f(n: Int): Int =
    when (n) {
      0 -> 1
      2 -> 2
      else -> if (n % 2 == 0) {
        f(n - 1) + f(n - 2) + f(n - 3) + f(n - 4)
      } else askServer(n)
    }

  println(f(n))



}