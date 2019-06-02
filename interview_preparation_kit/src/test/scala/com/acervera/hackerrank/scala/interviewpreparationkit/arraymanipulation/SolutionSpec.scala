package com.acervera.hackerrank.scala.interviewpreparationkit.arraymanipulation

import com.acervera.hackerrank.scala.interviewpreparationkit.arraymanipulation.Solution._
import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "arrayManipulation" should {
    "pass the basic example" in {
      arrayManipulation(2, Array(
        Array(1,2,100),
        Array(2,5,100),
        Array(3,4,100)
      )) should equal (200)
    }
  }

  "applyOperations" should {
    "update the array" when  {
      "from and to are in the middle" in {
        applyOperations( Array.fill[Long](10)(0), 4, 6, 3) should equal ( Array(0,0,0,3,3,3,0,0,0,0) )
      }
      "from and to are in the edges" in {
        applyOperations( Array.fill[Long](10)(0), 1, 10, 3) should equal ( Array.fill(10)(3) )
      }
      "apply only to one element" in {
        applyOperations( Array.fill[Long](5)(0), 4, 4, 3) should equal ( Array(0,0,0,3,0) )
      }
    }
  }
}
