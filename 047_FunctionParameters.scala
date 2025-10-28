@main
def functionParameters(): Unit = {
//  double(5)
  for (i <- 1 to 10)
    double(i)

  val clients = List("Anna", "John", "Michelle")
  sayHello(clients)

  double(5, "5 * 2 = ")
  double(17)
}

//def double(number: Int = 5): Unit = {
//  println(s"Double of $number is ${number * 2}")
//}

def double(number: Int, message: String = "Double is"): Unit = {
  println(s"$message ${number * 2}")
}

def sayHello(people: List[String]): Unit = {
  for (person <- people)
    println(s"Hi $person")
}