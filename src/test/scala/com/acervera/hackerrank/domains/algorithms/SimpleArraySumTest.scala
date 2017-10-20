package com.acervera.hackerrank.warmup

import com.acervera.hackerrank.domains.algorithms.SimpleArraySum
import org.scalatest.{FunSuite, Matchers}

class SimpleArraySumTest extends FunSuite with Matchers{

  test("testSimpleArraySum") {
    SimpleArraySum.simpleArraySum( 6, Array(1,2,3,4,10,11)) shouldBe 31
  }

}
