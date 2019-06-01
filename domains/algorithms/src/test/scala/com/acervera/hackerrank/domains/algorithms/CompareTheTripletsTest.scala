package com.acervera.hackerrank.domains.algorithms

import org.scalatest.{FunSuite, Matchers}

class CompareTheTripletsTest extends FunSuite with Matchers {

  test("testCompareTriplet") {
    CompareTheTriplets.compareTriplet( Seq(5,6,7), Seq(3,6,10) ) shouldBe "1 1"
    CompareTheTriplets.compareTriplet( Seq(1,1,1), Seq(10,10,10) ) shouldBe "0 3"
  }

}
