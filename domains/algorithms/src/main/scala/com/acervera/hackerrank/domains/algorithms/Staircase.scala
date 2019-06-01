package com.acervera.hackerrank.domains.algorithms

object Staircase {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();

    (1 to n) foreach(idx => println(Array.fill(idx)('#').padTo(n, ' ').reverse.mkString))
  }

}
