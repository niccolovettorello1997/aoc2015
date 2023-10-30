object Circuit:
  
  private val parser: CircuitParser = CircuitParser("")

  def execute: Unit =
    parser
      .parse
      .foreach(_.run)

  def getWire(name: Char): Wire =
    parser.getWire(name)
