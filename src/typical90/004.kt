package typical90

fun main() {
  val h: Int = (readLine()?.toInt() ?: 2).minus(1)
  val w: Int = (readLine()?.toInt() ?: 1).minus(1)
  val nestList = List(h + 1) { IntArray(w + 1) }
  val row = IntArray(h+1)
  val col = IntArray(w+1)

  val sumList = List(h + 1) { IntArray(w + 1) }

  for (i in 0..h) {
    for (j in 0..w) {
      nestList[i][j]=readLine()?.toInt() ?: 0
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