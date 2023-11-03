object Gates:

  def pad(i: String): String =
    var op: String = i

    while (op.length < 16) {
      op = "0" + op
    }

    op

  def not(op: String): String =
    op.map((bit: Char) => if bit == '1' then '0' else '1')

  def shiftRight(op: String, offset: Int): String =
    "0".repeat(offset) + op.substring(0, op.length - offset)

  def shiftLeft(op: String, offset: Int): String =
    op.substring(offset, op.length) + "0".repeat(offset)

  def or(op1: String, op2: String): String =
    var result: String = ""

    for (i <- 0 to 15) {
      result = result + (if op1.charAt(i) == '1' || op2.charAt(i) == '1' then '1' else '0')
    }

    result

  def and(op1: String, op2: String): String =
    var result: String = ""

    for (i <- 0 to 15) {
      result = result + (if op1.charAt(i) == '1' && op2.charAt(i) == '1' then '1' else '0')
    }

    result