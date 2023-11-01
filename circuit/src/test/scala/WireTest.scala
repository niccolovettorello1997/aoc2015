import org.scalatest.funsuite.AnyFunSuite

class WireTest extends AnyFunSuite:
  test("Wire.getName") {
    val wire: Wire = Wire('a')
    
    assert(wire.getName == 'a')
  }

  test("Wire.getRawValue") {
    val wire: Wire = Wire('a')

    wire.setValue(123)

    assert(wire.getRawValue == "0000000001111011")
  }
  
  test("Wire.setValue") {
    val wire: Wire = Wire('a')
    
    wire.setValue(1000)
    
    assert(wire.getValue == 1000)
  }

  test("Wire.setRawValue") {
    val wire: Wire = Wire('a')

    wire.setRawValue("111")

    assert(wire.getRawValue == Gates.pad("111"))
  }
