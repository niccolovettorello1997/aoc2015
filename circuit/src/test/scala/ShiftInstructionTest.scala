import org.scalatest.funsuite.AnyFunSuite

class ShiftInstructionTest extends AnyFunSuite:
  test("ShiftInstruction.leftShift") {
    val source: String = Gates.pad(123.toBinaryString)
    val offset: Integer = 2
    val target: Wire = Wire('a')

    val shiftInstruction: ShiftInstruction = ShiftInstruction(source, offset, target, Gates.shiftLeft)

    shiftInstruction.run()

    assert(target.getRawValue == Gates.pad(492.toBinaryString))
  }

  test("ShiftInstruction.rightShift") {
    val source: String = Gates.pad(456.toBinaryString)
    val offset: Integer = 2
    val target: Wire = Wire('a')

    val shiftInstruction: ShiftInstruction = ShiftInstruction(source, offset, target, Gates.shiftRight)

    shiftInstruction.run()

    assert(target.getRawValue == Gates.pad(114.toBinaryString))
  }
