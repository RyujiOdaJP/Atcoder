package typical90

fun main(args: Array<String>) {
  val inputs = readLine()?.split(" ")?.map { it.toInt() }
  val h: Int = (inputs?.get(0) ?: 2) - 1
  val w: Int = (inputs?.get(1) ?: 1) - 1

  val nestList = MutableList(h + 1) { IntArray(w + 1) }
  val row = IntArray(h + 1)
  val col = IntArray(w + 1)

  val sumList = List(h + 1) { IntArray(w + 1) }

  for (i in 0..h) {
    val input = readLine()?.split(" ")?.map { it.toInt() }
    for (j in 0..w) {
      nestList[i] = input?.toIntArray()!!
    }
  }

  for (i in 0..h) {
    for (j in 0..w) {
      row[i] += nestList[i][j]
      col[j] += nestList[i][j]
    }
  }

  for (i in 0..h) {
    for (j in 0..w) {
      sumList[i][j] = row[i] + col[j] - nestList[i][j]
    }
  }
  for (i in 0..h) {
    for (j in 0..w) {
      if (j >= 0) print(" ")
      print(sumList[i][j])
    }
    println()
  }
}