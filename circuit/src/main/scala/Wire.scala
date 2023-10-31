class Wire(name: Char):

  private var value: String = ""
    
  def getName: Char =
    name
    
  def getValue: Int =
    Integer.parseInt(value, 2)
    
  def getRawValue: String =
    value

  def setValue(value: Int): Unit =
    this.value = Gates.pad(value.toBinaryString)
