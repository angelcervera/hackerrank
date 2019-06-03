package com.acervera.hackerrank.scala.interviewpreparationkit.arraymanipulation

import java.io.PrintWriter

object Solution {

  // Complete the arrayManipulation function below.
  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {
    val (_FROM, _TO, _VALUE) = (0,1,2)

    val summedWithDifferences = Array.ofDim[Long](n)
    queries.foreach{
      query => {
        summedWithDifferences(query(_FROM)-1)+=query(_VALUE)
        if (query(_TO)!=n)
          summedWithDifferences(query(_TO))-=query(_VALUE)

        println(summedWithDifferences.toList)
      }
    }
    summedWithDifferences.foldLeft((0L,0L)) {case ((total,result),num) => (total+num,result max (total+num))}._2
  }

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
