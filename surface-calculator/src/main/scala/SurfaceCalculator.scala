object SurfaceCalculator:
  def calculateSurface(dimensions: List[List[Int]]): Int =
    dimensions
      .foldRight(0)((box: List[Int], surface: Int) => processBox(box) + surface)

  private def processBox(box: List[Int]): Int =
    box.min + box.foldRight(0)((dimension: Int, accumulator: Int) => 2 * dimension + accumulator)