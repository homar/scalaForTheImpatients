package pl.homar.scala.impatients.chapter9

import com.sun.xml.internal.bind.v2.runtime.ArrayBeanInfoImpl

object Main extends App {

  import scala.io.Source
  val fileIt = Source.fromFile("c:\\test.txt").getLines
  val arrayBuf = new scala.collection.mutable.ArrayBuffer[String]
  for(l <- fileIt){
	  arrayBuf += l
  }
  
  for(l <- arrayBuf.reverse){
    println(l)
  }
  
  for(l <- Source.fromFile("c:\\test.txt").getLines) for(w <- l.split("""\s+""")) if(w.length() > 12) println( w)
 
  val floats = Source.fromFile("c:\\floats.txt").getLines.toArray
  var sum = 0.0;
  var min = Float.MaxValue
  var max = Float.MinValue
  for(n <- floats){
    val i = n.toFloat
    sum += i
    if(i < min) min = i
    if(i > max) max = i
  }
  
  println("sum: " + sum)
  println("avg: " + sum/floats.length)
  println("max: " + max)
  println("min: " + min)
  
  for(i <- 1 to 20){
    print(Math.pow(2, i) + "      ")
    println(1/Math.pow(2,i))
  }
  
  
  
  
	  
}