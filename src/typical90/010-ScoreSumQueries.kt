package typical90

fun main(args: Array<String>) {
  val numberOfPeople = readLine()!!.toInt() // N
  val mutableMap = mutableMapOf<Int, Map<Int, Int>>()

  for (i in 1..numberOfPeople) {
    val list = readLine()!!.split(" ").map { it.toInt() }
    mutableMap[i] = mapOf(list[0] to list[1]) // index to [組(1 or 2) to 点数(0-100)]
  }

  val numberOfQuestions = readLine()!!.toInt() //Q

  for (i in 1..numberOfQuestions) {
    val rangeList = readLine()!!.split(" ").map { it.toInt() } // [3, 7]など
    var sum1 = 0
    var sum2 = 0

    for (j in rangeList[0]..rangeList[1]) { // j -> 3,4,5,6,7
//      targetList.add(mutableMap[j])
      //println(mutableMap)
      mutableMap[j]?.map {
        it.toPair().run {
          if (first == 1) sum1 += second
          else sum2 += second
        }
      }
    }
    println("$sum1 $sum2")

  }

}