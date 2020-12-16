//文字列に含まれる 1 の数を数える問題
fun main(args: Array<String>) {
  //  ラムダ式の引数が 1  つの場合、引数の宣言を省略して it を引数として使える
  val a = readLine()!!.count { it == '1' }
  println("result is: $a")

}