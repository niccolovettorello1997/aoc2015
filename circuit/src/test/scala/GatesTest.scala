import org.scalatest.funsuite.AnyFunSuite

class GatesTest extends AnyFunSuite:
  test("Gates.and") {
    assert(Gates.and(123.toBinaryString, 456.toBinaryString) == 72.toBinaryString)
  }

  test("Gates.or") {
    assert(Gates.or(123.toBinaryString, 456.toBinaryString) == 507.toBinaryString)
  }

  test("Gates.shiftLeft") {
    assert(Gates.shiftLeft(123.toBinaryString, 2) == 492.toBinaryString)
  }

  test("Gates.shiftRight") {
    assert(Gates.or(456.toBinaryString, 2) == 114.toBinaryString)
  }

  test("Gates.not") {
    assert(Gates.not(456.toBinaryString) == 65079.toBinaryString)
    assert(Gates.not(123.toBinaryString) == 65412.toBinaryString)
  }
