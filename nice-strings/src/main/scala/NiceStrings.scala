object NiceStrings:
  def isNice(input: String): Boolean =
    noBadStrings(input) && atLeastThreeVowels(input) && doubleCharacter(input)

  private def noBadStrings(input: String): Boolean =
    List("ab", "cd", "pq", "xy").forall((s: String) => !input.contains(s))

  private def atLeastThreeVowels(input: String): Boolean =
    input.toList.count((c: Char) => "aeiou".contains(c)) > 2

  private def doubleCharacter(input: String): Boolean =
    var previous: Char = '~'
    for (c <- input) {
      if previous == c then return true else previous = c
    }
    false
