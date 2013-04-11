package pl.homar.scala.impatients.chapter8

import scala.collection.mutable.ArrayBuffer

abstract class Item {
	def price(): Double
	def description(): String
}

class SimpleItem(val price: Double, val description: String) extends Item

class Bundle extends Item{
  val items = new ArrayBuffer[Item]
  
  override def price() = {
    var sum = 0.0
    for(i <- items)
      sum += i.price
      sum
  }
  
  override def description = {
    "bundle contains " + items.length + " items"
  }
  
}