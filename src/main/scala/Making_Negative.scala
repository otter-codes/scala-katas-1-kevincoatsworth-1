import scala.io.StdIn

object Making_Negative extends App {

  val userNum = StdIn.readLine("Please enter a number: ").toInt

  makeNumNegative(userNum)

  def makeNumNegative(num : Int) {

    if (num > 0) {

      println(num - num * 2)

    }

    else {

      println(num)

    }
  }

}
