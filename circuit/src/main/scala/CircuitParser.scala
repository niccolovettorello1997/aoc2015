import scala.io.{BufferedSource, Source}

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

  private def parseInsertion(tokens: List[String]): Runnable =
    val value: String = Gates.pad(Integer.parseInt(tokens.head).toBinaryString)
    val target: Wire = wires(tokens.last.head)

    InsertionInstruction(value, target)

  private def parseNot(tokens: List[String]): Runnable =
    val source: Wire = wires(tokens.apply(1).head)
    val target: Wire = wires(tokens.last.head)

    NotInstruction(source.getRawValue, target)

  private def parseBinary(tokens: List[String]): Runnable =
    val f: String = tokens.apply(1)
    val source: String = getWire(tokens.head.head).getRawValue
    val target: Wire = getWire(tokens.last.head)

    f.length match
      case 6 => ShiftInstruction(
        source,
        Integer.parseInt(tokens.apply(2)),
        target,
        if f == "LSHIFT" then Gates.shiftLeft else Gates.shiftRight
      )
      case _ => LogicInstruction(
        source,
        wires(tokens.apply(2).head).getRawValue,
        target,
        if f == "AND" then Gates.and else Gates.or
      )

  private def tokenize(rawInstruction: String): List[String] =
    rawInstruction.split(" ").toList

  private def parseRawInstruction(rawInstruction: String): Runnable=
    val tokens: List[String] = tokenize(rawInstruction)

    tokens.length match
      case 3 => parseInsertion(tokens)
      case 4 => parseNot(tokens)
      case 5 => parseBinary(tokens)

  def getWire(name: Char): Wire =
    wires(name)

  def parse: List[Runnable] =
    val source: BufferedSource = Source.fromFile(path)

    val rawInstructions: List[String] = source.getLines().toList

    source.close()

    rawInstructions.map((rawInstruction: String) => parseRawInstruction(rawInstruction))
