import org.scalatest.funsuite.AnyFunSuite

class NotInstructionTest extends AnyFunSuite:
  test("NotInstruction.run") {
    val value: String = "0000000000000000"
    val wire: Wire = Wire('a')

    val notInstruction: NotInstruction = NotInstruction(value, wire)

    notInstruction.run()

    assert(wire.getRawValue == "1111111111111111")
  }
