class Wire(name: Char):

  private var value: String = ""

  def getName: Char =
    name
    
  def getValue: Int =
    Integer.parseInt(value, 2)

  def setValue(value: Int): Unit =
    this.value = value.toBinaryString
