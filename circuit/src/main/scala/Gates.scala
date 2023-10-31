object Gates:

  private def normalize(s1: String, s2: String): List[String] =
    val sortedByLength: List[String] = List(s1, s2).sortBy(_.length)

    var short: String = sortedByLength.head
    val long: String = sortedByLength.last
    
    while(short.length < long.length) {
      short = "0" + short
    }
    
    List(short, long)
