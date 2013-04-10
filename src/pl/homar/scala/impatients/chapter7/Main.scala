package pl.homar.scala.impatients.chapter7

package com{
  class NoIdea{
    
  }
}


object Main extends App {
  val x = new com.NoIdea()
  
  import com._;
  val y = new NoIdea();
  
  import pl.homar.scala.impatients.chapter7.random._
  println(nextInt())
  
  import java.util.{HashMap => JavaHashMap}
  import scala.collection.mutable.HashMap
  
  val javaHashMap = new JavaHashMap[String,Int]()
  javaHashMap.put("1", 1)
  javaHashMap.put("2", 2)
  javaHashMap.put("3", 3)
  
  import scala.collection.JavaConversions._
  val scalaHashMap = new HashMap[Int, String]
  for((k,v) <- javaHashMap){
    scalaHashMap.put(v, k)
  }
  for((k,v) <- scalaHashMap){
    println(k + " " + v)
  }
  
  val user = new UserPropReader
  user.readData
  
}