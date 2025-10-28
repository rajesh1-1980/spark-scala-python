@main
def logicalOperators(): Unit = {
  println(true && true)
  println(true && false)

  val isDay = true
  val isEvening = true
  println(isDay && isEvening)

  println(true || false)
  println(false || false)

  val isNight = !isDay
  println(isNight)

}