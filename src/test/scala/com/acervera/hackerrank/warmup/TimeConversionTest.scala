package com.acervera.hackerrank.warmup

import org.scalatest.{FunSuite, Matchers}

class TimeConversionTest extends FunSuite with Matchers {

  test("testTimeConversion") {
    TimeConversion.timeConversion("07:05:45PM") shouldBe "19:05:45"
  }

}
