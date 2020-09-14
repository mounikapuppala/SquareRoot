package org.cigna.assignment

import org.scalatest.FlatSpec

class SquareRootTest extends FlatSpec {
  "squareRoot of 100" should "return 10" in {
    assert(Runner.findSquareRoot(100) == Math.sqrt(100))
  }
  "squareRoot of 121" should "return 11" in {
    assert(Runner.findSquareRoot(121) ==Math.sqrt(121))
  }
  "squareRoot of -1" should "return Invalid Number Error" in {
    val thrown = intercept[Exception] {
      Runner.findSquareRoot(-1)
    }
    assert(thrown.getMessage == "Invalid Number")
  }
  "squareRoot of 400000000" should "return 20000" in {
    assert(Runner.findSquareRoot(400000000) == Math.sqrt(400000000))
  }
  "squareRoot of 13" should "return 3.605551275463989" in {
    assert(Runner.findSquareRoot(13) == Math.sqrt(13))
  }
}