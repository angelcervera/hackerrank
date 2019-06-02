package com.acervera.hackerrank.scala.interviewpreparationkit.arraymanipulation

import better.files.File
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

  def parseLine(line: String): Array[Int] = line.split(" ").map(_.toInt).toArray

  def loadFile(path: String) = {

    val linesIter = File(path).lineIterator
    val headers = linesIter.next().split(" ").map(_.toInt)
    val arraySize = headers(0)
    val queriesSize = headers(1)
    val queries = linesIter.foldLeft(Array[Array[Int]]())( (acc, line) => acc :+ parseLine(line))

    require(queriesSize == queries.size)

    (arraySize, queries)
  }

//  "process highest number of operations for one column" in {
//    maxValOfColumn(1, Array.fill[Array[Int]](200000)(Array(1, 1, 2))) should be (400000L)
//  }
  "process highest number of operations for highest number of columns" in {
    arrayManipulation(30000000, Array.fill[Array[Int]](200000)(Array(1, 1, 2))) should be (400000L)
  }

  "process example 10" should {
    val input = loadFile("interview_preparation_kit/src/test/resources/com/acervera/hackerrank/scala/interviewpreparationkit/arraymanipulation/input10.txt")
//    "calculate one column in time" in {
//      maxValOfColumn(5317704, input._2) should be (2497860894L)
//    }
    "calculate all columns in time" in {
      arrayManipulation(input._1, input._2) should be (2510535321L)
    }
  }

}
