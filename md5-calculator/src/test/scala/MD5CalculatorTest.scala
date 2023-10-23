import org.scalatest.funsuite.AnyFunSuite

class MD5CalculatorTest extends AnyFunSuite:
  test("MD5Calculator.calculateMD5 with argument 1") {
    assert(MD5Calculator.calculateMD5("abcdef") == 609043)
  }

  test("MD5Calculator.calculateMD5 with argument 2") {
    assert(MD5Calculator.calculateMD5("pqrstuv") == 1048970)
  }
