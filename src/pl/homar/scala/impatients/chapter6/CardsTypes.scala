package pl.homar.scala.impatients.chapter6

object CardsTypes extends Enumeration {
	type CardColor = Value
	val HEARTS = Value("HEARTS")
	val DIAMONDS = Value("DIAMONDS")
	val CLUBS = Value("CLUBS")
	val SPADES = Value("SPADES")
	
	def checkIfRed(card: CardColor): Boolean = {
	  card == HEARTS || card == DIAMONDS
	}
}