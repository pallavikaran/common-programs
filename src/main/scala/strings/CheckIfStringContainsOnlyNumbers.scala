package strings

import scala.util.control.Breaks._
import java.util.regex.{Matcher, Pattern}

import scala.util.matching.Regex

object CheckIfStringContainsOnlyNumbers {

  def main(args: Array[String]): Unit = {

    val inputString1: String = "283729"
    val inputString2: String = "283jhsb729"
    val inputString3: String = "kjsjksbvkjabv"

    patternMatcher(inputString1)
    patternMatcher(inputString2)
    patternMatcher(inputString3)

    regexMatching(inputString1)
    regexMatching(inputString2)
    regexMatching(inputString3)

    asciiMatcher(inputString1)
    asciiMatcher(inputString2)
    asciiMatcher(inputString3)

  }


  private def patternMatcher(inputString: String): Unit = {

    val pattern: Pattern = Pattern.compile("\\d+")
    val matcher: Matcher = pattern.matcher(inputString)
    val matches: Boolean = matcher.matches()

    println(s"$inputString: $matches")
  }

  private def regexMatching(inputString: String): Unit = {

    val pattern: Regex = """([0-9]+)""".r
    val matches: Boolean = pattern.unapplySeq(inputString).isDefined

    println(s"$inputString: $matches")
  }

  private def asciiMatcher(inputString: String): Unit = {

    breakable {
      for (i <- 0 until inputString.length) {
        if (inputString(i).toByte > 57 || inputString(i).toByte < 48) {
          println(s"$inputString: false")
          break
        }
      }
      println(s"$inputString true")
    }
  }
}
