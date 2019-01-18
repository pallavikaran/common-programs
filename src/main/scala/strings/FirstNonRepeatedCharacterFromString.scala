package strings
import scala.util.control.Breaks._

object FirstNonRepeatedCharacterFromString {

  val NumberOfCharacters = 256

  def main(args: Array[String]): Unit = {

    val inputString: String = "geeksforgeeks"

    println("FUNCTIONAL PROGRAMMING")
   /* inputString.distinct.foreach(character => {
      if (inputString.count(_ == character) == 1) {
        println(s"$character = " + inputString.count(_ == character))
      }
    })*/

    println(inputString.distinct.map(x => (x, inputString.count(_ == x))).filter(_._2 == 1).map(_._1).head)

    println("OOPS PROGRAMMING")
    firstNonRepeatingString(inputString)
  }

  def firstNonRepeatingString(inputString: String): Unit = {
    val characterCount: Array[Int] = getCharacterCount(inputString)
    breakable {
      for (i <- 0 until NumberOfCharacters) {
        if (characterCount(i) == 1) {
          println(s"${i.toChar}")
          break
        }
      }
    }
  }


  private def getCharacterCount(inputString: String): Array[Int] = {
    val count: Array[Int] = Array.fill[Int](NumberOfCharacters)(0) //Creates array of 256 size and fills with 0
    for (i <- 0 until inputString.length) {
      count(inputString(i).toByte) = count(inputString(i).toByte) + 1 //inputString(i).toByte converts to ASCII
    }
    count
  }

}
