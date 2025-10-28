@main
def principlesInheritance(): Unit = {
  val carol = Daughter("english")
  println(carol.hairColor)
  println(carol.eyeColor)
  carol.say("Hi")
}

open class Mom(nativeTongue: String):
  def hairColor = "brown"
  val eyeColor = "blue"

  def say(message: String) = println(s"Mom says '$message' in $nativeTongue")

class Daughter(nativeTongue: String) extends Mom(nativeTongue):
  override def hairColor: String = "blonde"

  override def say(message: String): Unit =
    println(s"Daughter says $message")
    println(s"Mom's hair color is ${super.hairColor} daughter's hair color is $hairColor")
    super.say(message)