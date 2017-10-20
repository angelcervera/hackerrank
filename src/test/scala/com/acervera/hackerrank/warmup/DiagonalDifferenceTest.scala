package com.acervera.hackerrank.warmup

import org.scalatest.{FunSuite, Matchers}

class DiagonalDifferenceTest extends FunSuite with Matchers {

  test("difference") {
    DiagonalDifference.difference(Array(
      Array(11,2,4),
      Array(4,5,6),
      Array(10,8,-12)
    )) shouldBe 15
  }

}
