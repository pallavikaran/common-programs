package strings

object ReverseAString {

  def main(args: Array[String]): Unit ={
    val inputString: String = "The best thing about a boolean is even if you are wrong, you are only off by a bit."

    println("FUNCTIONAL PROGRAMING")
    println(inputString.reverse)
    println((for(i <- inputString.length until 0 by -1) yield inputString(i-1)).mkString)

    println("OOPS PROGRAMING")
    reverseUsingStringBuffer(inputString)
    reverseUsingIteration(inputString)
    println(reverseUsingRecursion(inputString))

  }

  def reverseUsingStringBuffer(inputString: String): Unit = println(new StringBuffer(inputString).reverse().toString)

  def reverseUsingIteration(inputString: String): Unit = {
    val stringBuilder: StringBuilder = new StringBuilder()
    val stringCharacters: Array[Char] = inputString.toCharArray

    for(i <- inputString.length until 0 by -1){
      stringBuilder.append(stringCharacters(i-1))
    }

    println(stringBuilder.toString)
  }

  def reverseUsingRecursion(inputString: String): String = {
    if(inputString.length < 2) {inputString}
    else reverseUsingRecursion(inputString.substring(1)) + inputString.charAt(0)
  }


}
