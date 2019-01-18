package strings

object PrintAllDuplicatesInAString {
  val NumberOfCharacters = 256

  def main(args: Array[String]): Unit = {
    val inputString: String = "Hello World"
    println("FUNCTIONAL PROGRAMMING")
    inputString.distinct.foreach(character => {
      if (inputString.count(_ == character) > 1)
        println(s"$character = " + inputString.count(_ == character))
    })

    println("OOPS PROGRAMMING")
    printDuplicates(inputString)
  }

  private def printDuplicates(inputString: String): Unit = {
    val populatedCharacterCount: Array[Int] = fillCharacterCount(inputString)

    for (i <- 0 until NumberOfCharacters) {
      if (populatedCharacterCount(i) > 1) {
        println(s"${i.toChar} = " + populatedCharacterCount(i))
      }
    }

  }

  private def fillCharacterCount(inputString: String): Array[Int] = {
    val count: Array[Int] = Array.fill[Int](NumberOfCharacters)(0) //Creates array of 256 size and fills with 0
    for (i <- 0 until inputString.length) {
      count(inputString(i).toByte) = count(inputString(i).toByte) + 1 //inputString(i).toByte converts to ASCII
    }
    count
  }
}
