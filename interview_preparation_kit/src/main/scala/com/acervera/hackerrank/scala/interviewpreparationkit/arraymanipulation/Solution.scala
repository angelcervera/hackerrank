package com.acervera.hackerrank.scala.interviewpreparationkit.arraymanipulation

import java.io.PrintWriter

object Solution {

  // Complete the arrayManipulation function below.
  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {
    (1 to n)
      .foldLeft(0L)( (maxVal, colIdx) => maxValOfColumn(colIdx, queries).max(maxVal))
  }

  def maxValOfColumn(colIdx: Int, queries: Array[Array[Int]]) =
    queries.foldLeft(0L)( (colVal, query) => inc(colIdx, colVal, query(0), query(1), query(2)))

  def inc(colIdx: Long, colVal: Long, from: Int, to: Int, addVal: Int) =
    if(colIdx >= from && colIdx <= to) colVal + addVal else colVal

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
