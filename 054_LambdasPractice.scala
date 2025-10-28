@main
def lambdasPractice(): Unit = {
  val numbers = Array[Double](2, 8, 5, 76, 3, 4, 7, 0, 38)
  println(numbers.toList)
  val newNumbers = update(numbers, (number: Double) => number / 10)
  println(newNumbers.toList)
}

