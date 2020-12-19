import kotlin.math.min

/*A - ABC Preparation  /
実行時間制限: 2 sec / メモリ制限: 1024 MB
配点 :100点

問題文
高橋君は、プログラミングコンテストを何回か開くことにしました。
コンテストを
1回開くには、100点問題、200点問題、300点問題、400点問題が
1問ずつ必要です。
100,200,300,400点問題の案がそれぞれ

A1,A2,A3,A4
 個あるとき、コンテストを最大で何回開けるでしょうか？
なお、同じ問題案は1 度しか使えません。

制約
1 ≤ Ai ≤ 100
(1 ≤ i ≤ 4)
入力は全て整数
*/

fun main(args: Array<String>) {
  val array = readLine()!!.split(" ").map(String::toInt)
  println(array.min())
}