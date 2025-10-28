import scala.util.Random

@main
def packages(): Unit = {
  admin.doAdmin()
  hr.doHr()
  admin.management.doMgmt()
}

package admin:
  def doAdmin() =
    println("Doing admin")

  package management:
    def doMgmt() =
      println("Doing admin management")

package hr:
  def doHr() =
    println("Doing HR")