import scala.io.StdIn

object Find_The_Century extends App {

  val userYear = StdIn.readLine("Please enter a year: ").toInt

  centuryFromYear(userYear)

  def centuryFromYear(year: Int) = {
    if (year % 100 == 0) {
      println(year/100)
    }
    else {
      println((year / 100) + 1)
  }
  }
}
