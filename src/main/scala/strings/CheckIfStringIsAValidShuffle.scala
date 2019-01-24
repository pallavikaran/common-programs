package strings


// interleaving (order of character is preserved after shuffling

// ACDB  is interleaving AB and CD
// ADEBCF  is interleaving ABC and DEF
// ACBCD  is interleaving ABC and CD
// ACDABC  is interleaving ABC and ACD

object CheckIfStringIsAValidShuffle {

  def main(args: Array[String]): Unit = {

    val inputString1: String = "pla"
    val inputString2: String = "alvi"
    val inputTestString: String = "pallavi"

    println(isValidShuffle(inputString1, inputString2, inputTestString))
  }

  def isValidShuffle(inputString1: String, inputString2: String, inputTestString: String): Boolean = {

    if(inputString1.length == 0 && inputString2.length == 0 && inputTestString.length == 0) {true}

    else if(inputTestString.length == 0) {false}

    else if (inputString1.length() != 0 && inputTestString.charAt(0) == inputString1.charAt(0)) {
       isValidShuffle(inputString1.substring(1), inputString2 , inputTestString.substring(1))
    }

    else if (inputString2.length() != 0 && inputTestString.charAt(0) == inputString2.charAt(0)) {
      isValidShuffle(inputString1, inputString2.substring(1) , inputTestString.substring(1))
    }
    else false
  }

  }
