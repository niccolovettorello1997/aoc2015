import org.scalatest.funsuite.AnyFunSuite

class LogicInstructionTest extends AnyFunSuite:
  test("LogicInstruction.and") {
    val op1: String = Gates.pad(123.toBinaryString)
    val op2: String = Gates.pad(456.toBinaryString)
    val target: Wire = Wire('a')

    val logicInstruction: LogicInstruction = LogicInstruction(op1, op2, target, Gates.and)

    logicInstruction.run()

    assert(target.getRawValue == Gates.pad(72.toBinaryString))
  }

  test("LogicInstruction.or") {
    val op1: String = Gates.pad(123.toBinaryString)
    val op2: String = Gates.pad(456.toBinaryString)
    val target: Wire = Wire('a')

    val logicInstruction: LogicInstruction = LogicInstruction(op1, op2, target, Gates.or)

    logicInstruction.run()

    assert(target.getRawValue == Gates.pad(507.toBinaryString))
  }
