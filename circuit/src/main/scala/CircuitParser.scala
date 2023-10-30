class CircuitParser(path: String):

  private val wires: Map[Char, Wire] = Map(
    'd' -> Wire('d'),
    'e' -> Wire('e'),
    'f' -> Wire('f'),
    'g' -> Wire('g'),
    'h' -> Wire('h'),
    'i' -> Wire('i'),
    'x' -> Wire('x'),
    'y' -> Wire('y')
  )
  
  def getWire(name: Char): Wire =
    wires(name)
