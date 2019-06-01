package com.acervera.hackerrank.scala.interviewpreparationkit

import org.scalatest.{Matchers, WordSpecLike}
import StacksBalancedBrackets._

class StacksBalancedBracketsTest extends WordSpecLike with Matchers {

  "balanced" must {

    "detect unbalanced" in {
      balanced("{[(])}".toList, List()) shouldBe false
      balanced("{{{{".toList, List()) shouldBe false
      balanced("}}}".toList, List()) shouldBe false
    }

    "detect banaced" in {
      balanced("[{}]".toList, List()) shouldBe true
      balanced("{}".toList, List()) shouldBe true
      balanced("()".toList, List()) shouldBe true
    }

    "process full list" in {
      balanced(Array("{[(])}","{{{{","}}}","[{}]","{}","()")) shouldBe Array(false,false,false,true,true,true)
    }

  }

}
