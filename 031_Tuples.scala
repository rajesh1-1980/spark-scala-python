@main
def tuples(): Unit = {
  val conn = (80, "www", "google.com", true)
  val conn2 = Tuple4(80, "www", "google.com", true)
  println(conn)
  println(conn2)

  val tup = Tuple2[Int, String](123, "abc")
  println(tup)

  println(conn(1))
  println(conn._1)
}