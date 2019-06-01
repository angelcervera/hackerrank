package com.acervera.hackerrank.domains.algorithms

import org.scalactic.TolerantNumerics
import org.scalatest.{FunSuite, Matchers}

class PlusMinusTest extends FunSuite with Matchers {

  test("testFactors") {
    implicit val doubleEquality = TolerantNumerics.tolerantDoubleEquality(0.0001)

    val ar = Array(-4,3,-9,0,4,1)
    val result = PlusMinus.factors(ar.length, ar)

    result._1 should equal(0.500000)
    result._2 should equal(0.333333)
    result._3 should equal(0.166667)
  }

}
