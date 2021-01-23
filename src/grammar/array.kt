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

//  目的特化したコレクション（List、Map、Set）も用意されています
//  Yoshihiro Yamada. Quick Master Kotlin: Lets master Kotlin for Android Development Sokushu (Japanese Edition) (Kindle Locations 752-753). WingsProject. Kindle Edition.
  val list = listOf("a", "b", "c")
  println(list) //[a, b, c]

  val set = setOf<String>("a", "a", "b", "c", "f", "d", "c", "C")
  println(set) //[a, b, c, f, d, C]

  val map = mapOf<String, Int>(
    "first" to 1,
    "second" to 2,
    "third" to 3
  )
  println(map) // {first=1, second=2, third=3}
  println(map["second"]) // 2

//list[1] = "cc" mutableではない
  var mutableList = mutableListOf<Int>(1, 2, 3, 4, 5)
  mutableList[0] = 0
  println(mutableList) //[0, 2, 3, 4, 5]

//  mutableListに対して、Listを不変（immutable）クラスと捉えるのは誤り
//  Yoshihiro Yamada. Quick Master Kotlin: Lets master Kotlin for Android Development Sokushu (Japanese Edition) (Kindle Locations 763-764). WingsProject. Kindle Edition.
  val list2 = listOf<List<Int>>(mutableList)
  println(list2)
  mutableList[1] = 345
  println(list2)

}