package strings

import java.util

object Palindrome {

  def main(args: Array[String]): Unit = {

    val inputString: String = "kayak"

    isPalindromeUsingStack(inputString)
    isPalindromeUsingStrings(inputString)

    if(inputString.toCharArray.reverse.mkString == inputString){
      println("This is a palindrome")
    }
    else{
      println("This is a NOT palindrome")
    }
  }

  def isPalindromeUsingStack(input: String): Unit = {

    val inputArray: Array[Char] = input.toCharArray
    val wordsStack: util.Stack[Char] = new util.Stack()
    var reverseString: String = ""

    inputArray.foreach(x => wordsStack.push(x))

    for(i <- inputArray.indices){
      val character: Char = wordsStack.pop
      reverseString =  reverseString + character
    }

    if(reverseString == input) {
      println("This is a palindrome")
    }
    else{
      println("This is a NOT palindrome")
    }

  }

  def isPalindromeUsingStrings(input: String): Unit = {

    val inputArray: Array[Char] = input.toCharArray
    var reverseString: String = ""

    for(i <- inputArray.length - 1 to 0 by -1){
      reverseString =  reverseString + s"${inputArray(i)}"
    }
    if(reverseString == input) {
      println("This is a palindrome")
    }
    else{
      println("This is a NOT palindrome")
    }
  }

}
