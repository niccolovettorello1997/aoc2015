object BracketsChecker:
  def checkBrackets(input: String): Int =
    input
      .toList
      .foldRight(0)((bracket: Char, counter: Int) => counter + (if bracket == '(' then 1 else -1))
