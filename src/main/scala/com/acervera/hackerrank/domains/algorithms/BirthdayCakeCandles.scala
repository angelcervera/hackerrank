package com.acervera.hackerrank.domains.algorithms

object BirthdayCakeCandles {
  def birthdayCakeCandles(n: Int, ar: Array[Int]): Int =  {
    val sorted = ar.sorted.reverse
    val max = sorted.head
    sorted.takeWhile(_ == max).size
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var ar = new Array[Int](n);
    for(ar_i <- 0 to n-1) {
      ar(ar_i) = sc.nextInt();
    }
    val result = birthdayCakeCandles(n, ar);
    println(result)
  }
}
