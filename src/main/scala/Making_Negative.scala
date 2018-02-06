import scala.io.StdIn

object Making_Negative extends App {

    def makeNumNegative(num : Int) {

    if (num > 0) {

      println(num - num * 2)

    }

    else {

      println(num)

    }
  }

  val userNum = StdIn.readLine("Please enter a number: ").toInt

  makeNumNegative(userNum)

}
