package strings

import java.util

object ReverseWordsInAString {

  def main(args: Array[String]): Unit ={

    val inputString: String = "This is what you came for."

    println(reverseWordsUsingStacks(inputString).trim)
    println(reverseWordsUsingStrings(inputString).trim)
    println(inputString.trim.split("\\s+").reverse.mkString(" "))

  }

  def reverseWordsUsingStacks(input: String): String = {

    val inputArray: Array[String] = input.trim.split("\\s+")
    val wordsStack: util.Stack[String] = new util.Stack()
    var reverseString: String = ""

    inputArray.foreach(x => wordsStack.push(x))

    for(i <- inputArray.indices){
      val word: String = wordsStack.pop
      reverseString =  reverseString + s"$word "
    }

    reverseString
  }


  def reverseWordsUsingStrings(input: String): String = {

    val inputArray: Array[String] = input.trim.split("\\s+")
    var reverseString: String = ""

    for(i <- inputArray.length - 1 to 0 by -1){
      reverseString =  reverseString + s"${inputArray(i)} "
    }

    reverseString
  }

}
