object Circuit:

  private val parser: CircuitParser = CircuitParser(
    "/home/niccolo/Documents/aoc2015/circuit/src/main/scala/instructions.txt"
  )

  def execute(): Unit =
    parser.dispatch()

  def getWire(name: Char): Wire =
    parser.getWire(name)
