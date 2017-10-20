package com.acervera.hackerrank.warmup

object CompareTheTriplets {
  def compareTriplet( a: Seq[Int], b: Seq[Int]): String = {
    val result = a.zip(b)
      .foldLeft((0, 0))((prev, v) => v._1 match {
        case a if a > v._2 => (prev._1 + 1, prev._2)
        case a if a < v._2 => (prev._1, prev._2 + 1)
        case _ => prev
      })
    s"${result._1} ${result._2}"
  }


  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var a0 = sc.nextInt();
    var a1 = sc.nextInt();
    var a2 = sc.nextInt();
    var b0 = sc.nextInt();
    var b1 = sc.nextInt();
    var b2 = sc.nextInt();

    println( compareTriplet(Seq(a0,a1,a2), Seq(b0,b1,b2)) )
  }
}
