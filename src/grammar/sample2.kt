package grammar

fun main() {
  var num = 100

// num = "sa" 型推論：Intでエラー
  num = 234_222_344 //アンダーバーで区切れる
  println(num)

//リテラルにサフィックスを付与
  val numFloat = 334F
  val numLong = 909000L

  println(numFloat::class)
  println(numLong::class)
//  class kotlin.Float
//  class kotlin.Long

  val msg = """
    「Kotlin」は、「コトリン」と読みます。
    JetBrainsが開発したオブジェクト指向言語です。
    AndroidStudio3でサポートされています。
    """
  println(msg)

  println("20 * 3 = ${20 * 3}") //文字列に${...}の形式で任意の式を埋め込むことができる




}