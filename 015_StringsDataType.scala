@main
def stringsDataType(): Unit = {
  val name: String = "John"
  println(name.getClass)

  val cats = 3
  println(cats.toString.getClass)

  val steps = "10000"
  println(steps.toInt.getClass)
  println(steps.toDouble.getClass)
}