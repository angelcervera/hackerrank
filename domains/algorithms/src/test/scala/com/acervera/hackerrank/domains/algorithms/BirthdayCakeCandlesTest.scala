package com.acervera.hackerrank.domains.algorithms

import org.scalatest.{FunSuite, Matchers}

class BirthdayCakeCandlesTest extends FunSuite with Matchers {

  test("testBirthdayCakeCandles") {
    BirthdayCakeCandles.birthdayCakeCandles(4, Array(3,2,1,3)) shouldBe 2
  }

}
