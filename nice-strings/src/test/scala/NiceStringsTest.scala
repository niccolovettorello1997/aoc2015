import org.scalatest.funsuite.AnyFunSuite

class NiceStringsTest extends AnyFunSuite:
  test("NiceStrings.isNice") {
    assert(NiceStrings.isNice("ugknbfddgicrmopn"))
    assert(NiceStrings.isNice("aaa"))
    assert(!NiceStrings.isNice("jchzalrnumimnmhp"))
    assert(!NiceStrings.isNice("haegwjzuvuyypxyu"))
    assert(!NiceStrings.isNice("dvszwmarrgswjxmb"))
  }
