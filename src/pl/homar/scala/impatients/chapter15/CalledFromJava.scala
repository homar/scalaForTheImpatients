package pl.homar.scala.impatients.chapter15

import scala.annotation.varargs
import scala.io.Source

class CalledFromJava {

  @varargs def sum(a:Int*) = {
    a.reduceLeft(_+_)
  }
  
  def getLines = {
    Source.fromFile("test.txt").getLines.mkString("\n")
  }
  
}