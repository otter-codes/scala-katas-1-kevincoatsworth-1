import scala.io.StdIn

object Index_Multiples extends App {

  val TheList = List(2, 4, 7, 9, 10,50)


  val refined = TheList.zipWithIndex
    .tail
    .filter(x => x._1 % x._2 == 0)
    .map(x => x._1)

  println(refined)

  // code from nick / pan
}
