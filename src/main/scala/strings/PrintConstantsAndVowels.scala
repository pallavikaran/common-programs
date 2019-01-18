package strings

object PrintConstantsAndVowels {

  def main(args: Array[String]): Unit = {

    val inputString: String = "hgdrsetsegxfcbnbnjkopiuyhgtfrdewaszxdcfvghbjkmnbvcxzsertyuijkmnbvghj"

    val vowels: Seq[String] = Seq("a", "e", "i", "o", "u")

    val inputArray: List[Char] = List(inputString).flatMap(_.toLowerCase)

    println(inputArray.filter(x => vowels.contains(x.toString)).mkString)
    println(inputArray.filterNot(x => vowels.contains(x.toString)).mkString)

    var constantsInString: List[Char] = List()
    var vowelsInString: List[Char] = List()

    for(index <- 0 until inputString.length){
      inputString(index).toString match{
        case "a" | "e" | "i" | "o" | "u" => vowelsInString = vowelsInString :+ inputString(index)
        case _ => constantsInString = constantsInString :+ inputString(index)
      }
    }

    println(vowelsInString)
    println(constantsInString)

  }

}
