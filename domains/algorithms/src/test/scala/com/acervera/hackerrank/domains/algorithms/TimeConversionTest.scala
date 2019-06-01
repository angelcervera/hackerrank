package com.acervera.hackerrank.domains.algorithms

import org.scalatest.{FunSuite, Matchers}

class TimeConversionTest extends FunSuite with Matchers {

  ignore("testTimeConversion") {
    TimeConversion.timeConversion("07:05:45PM") shouldBe "19:05:45"
  }

}
