package com.acervera.hackerrank.warmup

object MiniMaxSum {

  def minMaxSum(positions: Int, numbers: Array[Int]): (Long,Long) = {
    val sorted = numbers.sorted
    (
      sorted.take(positions).map(_.toLong).sum,
      sorted.takeRight(positions).map(_.toLong).sum
    )
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var arr = new Array[Int](5);
    for(arr_i <- 0 to 5-1) {
      arr(arr_i) = sc.nextInt();
    }

    val result = minMaxSum(4, arr)
    println(s"${result._1} ${result._2}")
  }
}
