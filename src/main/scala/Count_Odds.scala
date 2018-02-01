import scala.io.StdIn

object Count_Odds extends App {

  val userNum = StdIn.readLine("Please enter a number: ").toInt
  print(List.range(1,userNum,2)) //1 to userNum by 2

}