package strings

// a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from
object Anagram {

  def main(args: Array[String]): Unit = {
    val input1 = "listen"
    val input2 = "silent"
    val input3 = "pallavi"
    val input4 = "pallavk"
    val input5 = "karan"

    println("FUNCTIONAL PROGRAMMING")
    if(List(input3).flatMap(_.toUpperCase) forall List(input5).flatMap(_.toUpperCase).contains){
      println("This is an anagram")
    }
    else{
      println("This is not an anagram")

    }

    println("OOPS PROGRAMMING")
    checkForAnagram(input1, input2)
    checkForAnagram(input3, input4)
    checkForAnagram(input3, input5)


  }

  private def checkForAnagram(input1: String, input2: String): Unit = {
    var isAnagram: Boolean = true
    if (input1.length != input2.length) {
      isAnagram = false
    }
    else {

      val inputList1: Array[Char] = input1.toCharArray.sortWith(_ < _)
      val inputList2: Array[Char] = input2.toCharArray.sortWith(_ < _)

      for (i <- 0 until input1.length) {
        if (inputList1(i) != inputList2(i)) {
          isAnagram = false
        }
      }
    }
    if(isAnagram){
      println("This is an anagram")
    }
    else{
      println("This is not an anagram")
    }
  }
}
