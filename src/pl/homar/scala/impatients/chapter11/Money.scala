package pl.homar.scala.impatients.chapter11

class Money(d: Int, c: Int) {
	val dollars = d + (c/100)
	val cents = c % 100
	
	def + (other: Money) = {
	  val d = dollars + other.dollars
	  val c = cents + other.cents
	  new Money(d + c/100, c%100)
	}
	
	override def toString = {
	  dollars +"$ " + cents
	}
	
	def - (other: Money) = {
	  var d = dollars - other.dollars
	  var c = cents - other.cents
	  if(d > 0 && c < 0){
	    d -=1 
	    c += 100
	  }
	  new Money(d + c/100, c%100)
	}
	
	def ==(other: Money) = {
	  dollars == other.dollars && cents == other.cents 
	}
	
	def <(other: Money) = {
	  dollars < other.dollars || (dollars == other.dollars && cents < other.cents)
	}
}