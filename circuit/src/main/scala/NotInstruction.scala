class NotInstruction(value: String, target: Wire) extends Runnable {
  def run(): Unit =
    target.setRawValue(Gates.not(value))
}
