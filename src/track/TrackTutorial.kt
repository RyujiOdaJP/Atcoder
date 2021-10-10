package track

fun main() {
  var str = ""
  do {
    str = readLine() ?: break
  } while (str == "")
  println("Hello ${ str }!")
}