import org.scalatest.funsuite.AnyFunSuite

class WireTest extends AnyFunSuite:
  test("Wire.getName") {
    val wire: Wire = Wire('a')
    
    assert(wire.getName == 'a')
  }

  test("Wire.getRawValue") {
    val wire: Wire = Wire('a')

    wire.setValue(123)

    assert(wire.getRawValue == "1111011")
  }
  
  test("Wire internal representation") {
    val wire: Wire = Wire('a')
    
    wire.setValue(1000)
    
    assert(wire.getValue == 1000)
  }
