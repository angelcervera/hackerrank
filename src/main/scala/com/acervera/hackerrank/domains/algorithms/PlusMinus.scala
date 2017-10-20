package com.acervera.hackerrank.domains.algorithms

object PlusMinus {

  def factors(s: Double, ar: Array[Int]): (Double, Double, Double) = {
    val counter = ar.foldLeft((0, 0, 0))((prev, v) => v match {
      case _ if v > 0 => (prev._1 + 1, prev._2, prev._3)
      case _ if v < 0 => (prev._1, prev._2 + 1, prev._3)
      case _ => (prev._1, prev._2, prev._3 + 1)
    })
    (counter._1/s, counter._2/s, counter._3/s)
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt();
    }

    val result = factors(arr.length, arr)
    println(result._1)
    println(result._2)
    println(result._3)
  }
}
