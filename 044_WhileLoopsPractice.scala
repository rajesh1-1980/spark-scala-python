import scala.io.StdIn

@main
def whileLoopsPractice(): Unit = {
  var i = 0
  while (i < 10)
    i += 1
    println(s"#$i: Hello how are you")

  val cats = List("Tiger", "Smokey", "Sassy", "Patch", "Sammy")
  var j = 0
  while (j < cats.length)
    println(s"Hello ${cats(j)}")
    j += 1

  println("Please enter a number")
  val number = StdIn.readLine().toInt
  var k = 1
  var result = 1
  while (k <= number)
    result *= k
    k += 1
  println(s"$number! = $result")
}