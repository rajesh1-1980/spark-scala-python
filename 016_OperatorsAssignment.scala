@main
def operatorsAssignment(): Unit = {
    var dozen = 12

    val months = dozen
    dozen = 13

    println(dozen)
    println(months)

    val userName = "Lucy"
    val greeting = s"Hello, $userName"
    println(greeting)

    val products = 3
    val price = 9.99
    val total = s"Your total is $$${products * price}"
    println(total)
}