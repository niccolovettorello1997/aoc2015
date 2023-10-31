import org.scalatest.funsuite.AnyFunSuite

class GatesTest extends AnyFunSuite:
  test("Gates.and") {
    assert(Gates.and(Gates.pad(123.toBinaryString), Gates.pad(456.toBinaryString)) == Gates.pad(72.toBinaryString))
  }

  test("Gates.or") {
    assert(Gates.or(Gates.pad(123.toBinaryString), Gates.pad(456.toBinaryString)) == Gates.pad(507.toBinaryString))
  }

  test("Gates.shiftLeft") {
    assert(Gates.shiftLeft(Gates.pad(123.toBinaryString), 2) == Gates.pad(492.toBinaryString))
  }

  test("Gates.shiftRight") {
    assert(Gates.shiftRight(Gates.pad(456.toBinaryString), 2) == Gates.pad(114.toBinaryString))
  }

  test("Gates.not") {
    assert(Gates.not(Gates.pad(456.toBinaryString)) == Gates.pad(65079.toBinaryString))
    assert(Gates.not(Gates.pad(123.toBinaryString)) == Gates.pad(65412.toBinaryString))
  }
