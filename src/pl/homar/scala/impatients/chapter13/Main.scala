package pl.homar.scala.impatients.chapter13

import scala.collection.mutable.HashMap
import scala.collection.mutable.LinkedHashSet
import scala.collection.mutable.LinkedList

object Main extends App{
	def indexesWithMapAndSet(input: String) = {
	  var res = new HashMap[Char, LinkedHashSet[Int]]
	  for((c,i) <- input.zipWithIndex){
	    var s = res.getOrElse(c, new LinkedHashSet[Int])
	    s += i
	    res(c.toChar) = s
	  }
	  res
	}
	
	println(indexesWithMapAndSet("Missisipi"))
	
	def indexesWithMapAndList(input: String) = {
	  input.zipWithIndex.groupBy(_._1).map(x => (x._1, x._2.map(_._2).toList))
	}
	
	println(indexesWithMapAndList("Missisipi"))
	
	def removeZeros(list: List[Int]) = {
	  list.filter(x => x != 0)
	}
	
	val  x = List(5, 7, 0, 18, 22, 0, 12, 1, 0, 5, 0)
	
	println(removeZeros(x))
	
	def mapNamesToInts(names: Array[String], map: Map[String, Int]) = {
	  names.toList.map(map.get(_)).flatMap(x => x)
	}
	
	val names = Array("Tom", "Fred", "Harry")
	val namesToInt = Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)
	
	println(mapNamesToInts(names, namesToInt))
	
	def myMkString[T](s: Seq[T], sep: String = ", ") = {
	  s.map(_.toString).reduceLeft(_ + sep + _)
	}
	
	println(myMkString(names))
	
	def countTotalPrice(prices: List[Double], quantities: List[Int])= {
	  (prices zip quantities).map(((x:Double, y: Int) => x*y).tupled).reduceLeft(_+_)
	}
	
	val prices = List(5.0, 20.0, 9.95) 
	val quantities = List(10, 2, 1)
	
	println(countTotalPrice(prices, quantities))
	
	def to2DArray(arr: Array[Int], columnsNumber: Int) = {
	  arr.grouped(columnsNumber).toArray.map(_.toArray)
	}
	
	val arr = Array(1,2,3,4,5,6)
	
	println(to2DArray(arr, 3).deep.mkString(","))
	
	val str = io.Source.fromFile("test.txt").mkString
	
	val freq = str.par.aggregate(new collection.immutable.HashMap[Char, Int])(
		(x, c) => x + (c ->(x.getOrElse(c, 0) + 1)),
		(map1, map2) => map1 ++ map2.map{ case (k,v) => k -> (v + map1.getOrElse(k,0)) }		
	)
	
	println(freq)
	
}