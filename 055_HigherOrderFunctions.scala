@main
def higherOrderFunctions(): Unit = {
	 val names = List("Mary", "Kate", "Mike")
	 val myLambda = (name: String) => println(s"Hello $name")

   sayHello(names, myLambda)

//  sayHello(names, (name: String) => println(s"Hello $name"))

  sayHello(List("Mary", "Kate", "Mike"), (name: String) => println(s"Hello $name"))
}

def sayHello(names: List[String], doSomething: String => Unit): Unit =
  for (name <- names)
    doSomething(name)