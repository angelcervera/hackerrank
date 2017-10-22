package com.acervera.hackerrank.tutorials.crackingthecodinginterview

import scala.annotation.tailrec

object StacksBalancedBrackets {

  def balanced(arr:Array[String]): Array[Boolean] = arr.map( brackets => balanced(brackets.toList, List()))

  @tailrec
  def balanced(brackets:List[Char], stack:List[Char]):Boolean =
    brackets match {
      case Nil => stack.size == 0
      case bracketsHead::bracketsTail => bracketsHead match {
        case _ if "{[(" contains bracketsHead => balanced(bracketsTail, bracketsHead :: stack)
        case _ => stack match {
          case Nil => false
          case stackHead::stackTail => stackHead match {
            case '{' if bracketsHead == '}' => balanced(bracketsTail, stackTail)
            case '(' if bracketsHead == ')' => balanced(bracketsTail, stackTail)
            case '[' if bracketsHead == ']' => balanced(bracketsTail, stackTail)
            case _ => false
          }
        }
      }
    }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val t = sc.nextInt();
    val arr = (1 to t).map(_ => sc.next()).toArray

    balanced(arr).foreach{
      case true => println("YES")
      case _ => println("NO")
    }
  }

}
