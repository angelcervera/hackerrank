package com.acervera.hackerrank.domains.algorithms

import java.time.LocalTime
import java.time.format.DateTimeFormatter

object TimeConversion {

  def timeConversion(s: String): String =
    LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa")).format( DateTimeFormatter.ofPattern("HH:mm:ss"))

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var s = sc.next();
    val result = timeConversion(s);
    println(result)
  }
}
