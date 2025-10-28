@main
def numbersTypeConversions(): Unit = {
    val cats = 3
    val longCats = cats.toLong
    println(cats.getClass)
    println(longCats.getClass)

    val dogs = 5
    val byteDogs = dogs.toByte
    println(byteDogs.getClass)
    println(byteDogs)

    val floatDogs = dogs.toFloat
    println(floatDogs.getClass)
    println(floatDogs)
}