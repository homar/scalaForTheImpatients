package pl.homar.scala.impatients.chapter12

import scala.collection.mutable.ListBuffer

object Main extends App {
	def values(fun: (Int) => Int, low: Int, high: Int) = {
	  for(i <- low to high) yield (i, fun(i))
	}
	
	println(values(x => x*x, -5, 5))
	
	val tab = Array(1,2,3,4,5,3,2,4,1)
	println(tab.reduceLeft((x,y)=> if(x>y)x else y))
	
	def factorial(i: Int) = {
	  (1 to i).reduceLeft(_*_)
	}
	
	println(factorial(5))
	
	def factorialBetter(i: Int) = {
	 (1 to i).foldLeft(1)(_*_) 
	}
	
	println(factorialBetter(-3))
	
	def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
	  inputs.map(fun).reduceLeft((x,y) => if(x>y)x else y)
	}
	
	println(largest(x => 10* x - x*x, 1 to 10))
	
	def largestReturnIndex(fun: (Int) => Int, inputs: Seq[Int]) = {
	  inputs.reduceLeft((x,y) => if(fun(x) > fun(y)) x else y)
	}
	
	println(largestReturnIndex(x => 10* x - x*x, 1 to 10))
	
	def adjustToPair(f: (Int, Int) => Int) = (x:(Int, Int))=> f(x._1,x._2) 
	
	println(adjustToPair(_*_)((6,7)))
	
	val pairs = (1 to 10) zip (11 to 20)
	println(pairs)
	
	println(pairs.map(x=>adjustToPair(_+_)((x._1,x._2))))
	
	val strings = Array("Hello", "beautyful", "world", "!")
	val lengths = (strings.map(_.length))
	
	println(strings.corresponds(lengths)(_.length == _))
	
	def unless(condition: => Boolean)(block: => Unit){
	  if(!condition) {block}
	}
	
	unless( 2 == 1) {println("dupa")}
	
}