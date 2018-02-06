import scala.io.StdIn

object Find_The_Century extends App {

  def centuryFromYear(year: Int) = {
    if (year % 100 == 0) {
      println(year/100)
    }
    else {
      println((year / 100) + 1)
    }
  }

  val userYear = StdIn.readLine("Please enter a year: ").toInt

  centuryFromYear(userYear)

}
