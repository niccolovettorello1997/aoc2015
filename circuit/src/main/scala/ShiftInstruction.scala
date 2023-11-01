class ShiftInstruction(source: String, offset: Int, target: Wire, f: (String, Int) => String) extends Runnable {
  def run(): Unit =
    target.setRawValue(f(source, offset))
}
