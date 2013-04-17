package pl.homar.scala.impatients.chapter14

abstract class Item 
case class Article(description: String, price: Double) extends Item 
case class Bundle(description: String, discount: Double, items: Item*) extends Item
case class Multiple(quantity: Int, a:Article) extends Item


object Item {
	def price(it: Item): Double = it match { 
	  case Article(_, p) => p 
	  case Bundle(_, disc, its @ _*) => its.map(price _).sum - disc
	  case Multiple(q: Int, a: Article) => q*price(a)
	}
}