package strings

object RemoveDuplicateCharactersInAString {

  def main(args: Array[String]): Unit = {
    val inputString: String = "banana"

    println(removeDuplicateCharacters(inputString))
  }

  def removeDuplicateCharacters(input: String): String = {

    val inputArray: Array[Char] = input.toCharArray
    var uniqueString: String = ""

    inputArray.foreach(x => {
      if (!uniqueString.toCharArray.contains(x)) {
        uniqueString = uniqueString + x.toString
      }
    }
    )
    uniqueString
  }

  }
