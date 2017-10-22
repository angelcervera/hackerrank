package com.acervera.hackerrank.tutorials.crackingthecodinginterview

/**
  * Make non sense in Scala.
  * In fact, the Stack class is deprecated.
  */
object QueuesATaleOfTwoStacks {

  def enqueue(stack: Vector[Long], value:Long): Vector[Long] = stack :+ value

  def dequeue(stack: Vector[Long]): Vector[Long] = stack.tail

  def peek(stack: Vector[Long]) = {
    println(stack.head)
    stack
  }

  def parse(inst:String):(Int, Long) =
    inst.split(" ") match {
      case p if p.size == 1 => (p(0).toInt,0)
      case p if p.size == 2 => (p(0).toInt, p(1).toLong)
      case _ => throw new IllegalArgumentException(inst)
    }


  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var stack = Vector[Long]()
    val n = sc.nextInt()
    (1 to n) foreach(_ =>
      stack = sc.nextInt match {
        case 1 => enqueue(stack, sc.nextLong)
        case 2 => dequeue(stack)
        case 3 => peek(stack)
    })
  }

}
