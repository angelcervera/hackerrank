package com.acervera.hackerrank.warmup

import com.acervera.hackerrank.domains.algorithms.AVeryBigSum
import org.scalatest.{FunSuite, Matchers}

class AVeryBigSumTest extends FunSuite with Matchers {

  test("testAVeryBigSum") {
    AVeryBigSum.aVeryBigSum(5, Array(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)) shouldBe 5000000015L
  }

}
