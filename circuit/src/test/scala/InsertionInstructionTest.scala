import org.scalatest.funsuite.AnyFunSuite

class InsertionInstructionTest extends AnyFunSuite:
  test("InsertionInstruction.run") {
    val value: String = "111"
    val wire: Wire = Wire('a')

    val insertionInstruction: InsertionInstruction = InsertionInstruction(value, wire)

    insertionInstruction.run()

    assert(wire.getRawValue == "0000000000000111")
  }
