package pl.homar.scala.impatients.chapter15

import scala.collection.mutable.ListBuffer

object Main extends App {
	val calledFromJava = new CalledFromJava
	println(calledFromJava.sum(1, 2, 3, 4, 5, 6))
	println(classOf[CalledFromJava].getMethods.toList)
	println(calledFromJava.getLines)
	
	@volatile var myField:Boolean = false
	import concurrent.ops.spawn
	
	spawn {
	  Thread.sleep(1000)
	  myField = true
	  println("thread 1 finished its job")
	}
	
	spawn {
	  while(!myField) Thread.sleep(250)
	  println("thread 2 finished its job")
	}
	
	var myField2:Boolean = false
	
	spawn {
	  Thread.sleep(2000)
	  myField2 = true
	  println("thread 1 finished its job")
	}
	
	spawn {
	  while(!myField2) Thread.sleep(350)
	  println("thread 2 finished its job")
	}
	
}