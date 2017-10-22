package com.acervera.hackerrank.tutorials.crackingthecodinginterview

import org.scalatest.{Matchers, WordSpecLike}
import QueuesATaleOfTwoStacks._

class QueuesATaleOfTwoStacksTest extends WordSpecLike with Matchers {

  "dequeue" must {
    "remove the head because has the older" in {
      dequeue( Vector(1,2,3,4,5) ) shouldBe Vector(2,3,4,5)
    }
  }

  "enqueue" must {
    "add the new element at the very bottom" in {
      enqueue( Vector(1,2,3,4,5), 6) shouldBe Vector(1,2,3,4,5,6)
    }
  }

  "parse" must {
    "detect all cases" in {
      parse("1 42") shouldBe (1,42L)
      parse("2") shouldBe (2,0)
      parse("3") shouldBe (3,0)
    }
  }

}
