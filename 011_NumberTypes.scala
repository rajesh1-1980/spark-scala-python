@main
def numberTypes(): Unit = {
    val items = 5
    println(items.getClass)

    val price = 29.99f
    println(price.getClass)

    val pi = 3.14159
    println(pi.getClass)
}