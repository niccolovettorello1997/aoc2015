import org.scalatest.funsuite.AnyFunSuite

class BracketsCheckerTest extends AnyFunSuite:
  test("BracketsChecker.checkBrackets") {
    assert(BracketsChecker.checkBrackets("(())") == 0)
    assert(BracketsChecker.checkBrackets("()()") == 0)
    assert(BracketsChecker.checkBrackets("(((") == 3)
    assert(BracketsChecker.checkBrackets("(()(()(") == 3)
    assert(BracketsChecker.checkBrackets("))(((((") == 3)
    assert(BracketsChecker.checkBrackets("())") == -1)
    assert(BracketsChecker.checkBrackets("))(") == -1)
    assert(BracketsChecker.checkBrackets(")))") == -3)
    assert(BracketsChecker.checkBrackets(")())())") == -3)
  }
