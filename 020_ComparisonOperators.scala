
@main
def comparisonOperators(): Unit = {
  val a = 1
  val b = 1
  println(s"$a > $b will return ${a > b}")
  println(a < b)
  println(a >= b)
  println(a <= b)
  println(a == b)
  println(a != b)
  println(r1)
  val r2 = a <= b
  println(r2)

  println(r1 || r2)

  val r3 = ((3 >= 5) && (3 < 5)) || (6 == 6)
  println(r3)

}