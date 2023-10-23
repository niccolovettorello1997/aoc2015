import java.security.MessageDigest

object MD5Calculator:
  def calculateMD5(key: String): Int =
    var index: Int = 1
    while(!isConditionSatisfied(key, index)) {
      index = index + 1
    }
    index

  private def isConditionSatisfied(key: String, index: Int): Boolean =
    md5(key + index)
      .toList
      .take(5)
      .forall(_ == 0)

  private def md5(input: String): String =
    MessageDigest
      .getInstance("MD5")
      .digest(input.getBytes("UTF-8"))
      .map("%02x".format(_))
      .mkString
