import org.scalatest.funsuite.AnyFunSuite

class WireTest extends AnyFunSuite:
  test("Wire.getName") {
    val wire: Wire = Wire('a')
    
    assert(wire.getName == 'a')
  }
  
  test("Wire internal representation") {
    val wire: Wire = Wire('a')
    
    wire.setValue(1000)
    
    assert(wire.getValue == 1000)
  }
