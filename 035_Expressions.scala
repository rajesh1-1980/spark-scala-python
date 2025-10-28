import scala.io.StdIn

@main
def expressions(): Unit = {
  val haveCat = true
  val haveCatFood = true
  if (haveCat && haveCatFood)
    println("Cat is happy")
  else
    println("Oh no!")


}