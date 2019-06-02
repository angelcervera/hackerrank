package com.acervera.hackerrank.scala.interviewpreparationkit.arraymanipulation

import java.io.PrintWriter

object Solution {

  // Complete the arrayManipulation function below.
  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {
    queries
      .foldLeft(Array.fill[Long](n)(0))( (acc, query) => applyOperations(acc, query(0), query(1), query(2)))
      .max
  }

  def applyOperations(array: Array[Long], from: Int, to: Int, value: Int) : Array[Long] =
    array.take(from -1) ++ array.slice(from -1, to).map(_ + value) ++ array.takeRight(array.size - to)

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val nm = stdin.readLine.split(" ")

    val n = nm(0).trim.toInt

    val m = nm(1).trim.toInt

    val queries = Array.ofDim[Int](m, 3)

    for (i <- 0 until m) {
      queries(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    val result = arrayManipulation(n, queries)

    printWriter.println(result)

    printWriter.close()
  }
}
