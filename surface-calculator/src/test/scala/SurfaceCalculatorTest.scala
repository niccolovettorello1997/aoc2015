import org.scalatest.funsuite.AnyFunSuite

class SurfaceCalculatorTest extends AnyFunSuite:
  test("SurfaceCalculator.calculateSurface") {
    val box1 = List(90, 40, 74) // 448
    val box2 = List(51, 100, 29) // 389
    val box3 = List(10, 46, 76) // 274

    assert(SurfaceCalculator.calculateSurface(List(box1, box2, box3)) == 1111)
  }
