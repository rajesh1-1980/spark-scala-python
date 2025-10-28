import scala.util.Random

@main
def userInputRandomNumber(): Unit = {
  println(Random.nextInt())
  println(Random.nextInt(100))
  println(Random.nextString(20))
  println(Random.nextPrintableChar())

}