package strings

object FindAllPermutationsOfAString {

  val inputString: String = "man"

  def main(args: Array[String]): Unit ={

    permutation(inputString, 0, inputString.length -1)

  }

  def permutation(input: String, start: Int, end: Int): Unit = {
    var str: String = input
    if(start ==  end){
      println(str)
    }

    else{
      for(j <- start to end){
        str = swap(str, start, j)
        permutation(str, start + 1, end)
        str = swap(str, start, j)
      }

    }
  }

  def swap(swapString: String, start: Int, end: Int): String ={
    val array: Array[Char] = swapString.toCharArray

    val temp = array(start)
    array(start) = array(end)
    array(end) = temp

    array.mkString
  }


}
