package com.acervera.hackerrank.tutorials.crackingthecodinginterview

import org.scalatest.{Matchers, WordSpecLike}
import ArraysLeftRotation._

class ArraysLeftRotationTest extends WordSpecLike with Matchers {

  "RotateLeft" should  {
    "move one left" in {
      rotateLeft( 1, Array(1,2,3,4,5) ) shouldBe Array(2,3,4,5,1)
    }
    "move 4 left" in {
      rotateLeft( 1, Array(1,2,3,4,5) ) shouldBe Array(5,1,2,3,4)
    }
    "move 5 left over 5 elements" in {
      rotateLeft( 1, Array(1,2,3,4,5) ) shouldBe Array(1,2,3,4,5)
    }
  }

}
