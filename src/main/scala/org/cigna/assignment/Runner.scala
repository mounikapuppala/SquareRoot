package org.cigna.assignment

object Runner {

  def main(args: Array[String]): Unit = {
    println("Enter the number you want to find square root for.")
    val inputNum = scala.io.StdIn.readInt()
    val sRoot = findSquareRoot(inputNum)
    println(s"The Square Root of ${inputNum} using my program is ${sRoot}")
    println(s"The Square Root of ${inputNum} using Math.sqrt is ${Math.sqrt(inputNum)}")
  }

  def absolute(x: Double): Double = if (x < 0) -x else x

  def findSquareRoot(num: Double) : Double = {
  //Throwing IllegalArgumentException when number is less than 0
  if( num < 0) throw new IllegalArgumentException("Invalid Number")
  // 1e15 is a peta
  // 1e-12 can be read as 1 * 10 power -12
    val threshold = if (num < 1) num / 1e15 else 1e-12
    def squareRoot(x: Double): Double = x match {
      case y if absolute(y * y - num) < threshold => {
        def diff1 = absolute(num - x * x)
        def diff2 = absolute(num - num / x * num / x)
        if (diff1 < diff2) x else num / x
      }
      case y if y == num / y => y
      case _ => squareRoot((x + num / x) / 2)
    }
    squareRoot(num / 2)
  }
  }