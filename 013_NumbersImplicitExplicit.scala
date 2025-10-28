@main
def numbersImplicitExplicit(): Unit = {
    val meals: Int = 3
    println(meals.getClass)
    val life: Long = 42l
    println(life.getClass)
    val money: Double = 5.99
    println(money.getClass)
    val moreMoney: Float = 6.99
    println(moreMoney.getClass)
}