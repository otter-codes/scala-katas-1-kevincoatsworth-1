import scala.io.StdIn

object Count_Odds extends App {

  val userNum = StdIn.readLine("Please enter a number: ").toInt

  listOddNums(userNum)

  def listOddNums(num : Int) {

    print(List.range(1, num, 2)) //1 to userNum by 2

  }
}