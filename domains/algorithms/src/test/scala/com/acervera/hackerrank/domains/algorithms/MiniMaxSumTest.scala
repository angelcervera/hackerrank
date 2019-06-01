package com.acervera.hackerrank.domains.algorithms

import org.scalatest.{FunSuite, Matchers}

class MiniMaxSumTest extends FunSuite with Matchers {

  test("testMinMaxSum") {
    MiniMaxSum.minMaxSum(4, Array(1,2,3,4,5)) shouldBe (10,14)
    MiniMaxSum.minMaxSum(4, Array(3,1,2,4,5)) shouldBe (10,14)
    MiniMaxSum.minMaxSum(4, Array(3,1,Integer.MAX_VALUE,4,5)) shouldBe (13,2147483659L)
  }

}
