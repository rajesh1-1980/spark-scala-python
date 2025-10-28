@main
def multilineStrings(): Unit = {
  val str1 = "This is a\nmultiline\nstring"
  println(str1)

  val str2 = """This is a
      multiline
      string
      """
  println(str2)

  val str3 = """This is a
      |multiline
      |string
      |""".stripMargin
    println(str3)
}