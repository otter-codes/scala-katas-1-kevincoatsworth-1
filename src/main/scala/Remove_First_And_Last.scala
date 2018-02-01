import scala.io.StdIn

object Remove_First_And_Last extends App {

  val userString = StdIn.readLine("Please enter a String: ")

  removeSpaces(userString)

  def removeSpaces(word : String) {
    if (word.length < 3) {

      println("")

    }

    else {

      println(word.slice(1, word.length - 1))

    }
  }

}
