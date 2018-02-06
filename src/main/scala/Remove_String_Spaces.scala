import scala.io.StdIn

object Remove_String_Spaces extends App {

  def removeWhiteSpaces(word : String) = {

    word.replaceAll(" ","")

  }

  val userString = StdIn.readLine("Please enter a String: ")

  println(removeWhiteSpaces(userString))

}
