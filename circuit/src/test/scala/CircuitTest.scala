import org.scalatest.funsuite.AnyFunSuite

class CircuitTest extends AnyFunSuite:
  test("Circuit.run with argument 1") {
    Circuit.execute()

    assert(Circuit.getWire('d').getValue == 72)
    assert(Circuit.getWire('e').getValue == 507)
    assert(Circuit.getWire('f').getValue == 492)
    assert(Circuit.getWire('g').getValue == 114)
    assert(Circuit.getWire('h').getValue == 65412)
    assert(Circuit.getWire('i').getValue == 65079)
    assert(Circuit.getWire('x').getValue == 123)
    assert(Circuit.getWire('y').getValue == 456)
  }
