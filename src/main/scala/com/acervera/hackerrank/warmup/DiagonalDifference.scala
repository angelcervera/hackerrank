package com.acervera.hackerrank.warmup

object DiagonalDifference {
  def difference(matrix: Array[Array[Int]]): Long = {
    val offset = matrix.size-1
    Math.abs(
      matrix.zipWithIndex.foldLeft(0)((prev, v) => prev + v._1(v._2))
        -
        matrix.zipWithIndex.foldLeft(0)((prev, v) => prev + v._1(offset - v._2))
    )
  }


  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var a = Array.ofDim[Int](n,n);
    for(a_i <- 0 to n-1) {
      for(a_j <- 0 to n-1){
        a(a_i)(a_j) = sc.nextInt();
      }
    }

    println(difference(a))
  }
}
