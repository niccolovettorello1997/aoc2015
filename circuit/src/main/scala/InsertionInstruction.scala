class InsertionInstruction(value: String, target: Wire) extends Runnable {
  def run(): Unit =
    target.setRawValue(value)
}
