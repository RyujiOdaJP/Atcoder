package grammar

fun main() {
  val data = arrayOf(2, 3, 4, 5)
  val intArray = intArrayOf(1, 2, 3)
  var nullArray: Array<String?> = arrayOfNulls(5)
  println(nullArray)
  // Array Constructor
  val arrayConstructor = Array(5, { i -> i * 3 })
  println(arrayConstructor[0].toString())
  arrayConstructor.forEach { i -> println(i) }
  arrayConstructor.forEach { println(it) } //同上
}