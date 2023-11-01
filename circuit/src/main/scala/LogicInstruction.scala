class LogicInstruction(op1: String, op2: String, target: Wire, f: (String, String) => String) extends Runnable {
  def run(): Unit =
    target.setRawValue(f(op1, op2))
}
