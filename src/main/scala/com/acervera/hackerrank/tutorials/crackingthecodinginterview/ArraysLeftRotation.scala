package com.acervera.hackerrank.tutorials.crackingthecodinginterview

object ArraysLeftRotation {

  def rotateLeft(positions: Int, ar: Array[Int]): Array[Int]  = ar.takeRight(ar.length-positions) ++ ar.take(positions)

  def asString(positions: Int, ar: Array[Int]): String = rotateLeft(positions, ar).mkString(" ")

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var k = sc.nextInt();
    var a = new Array[Int](n);
    for(a_i <- 0 to n-1) {
      a(a_i) = sc.nextInt();
    }

    println(asString(k, a))
  }
}
