package pl.homar.scala.impatients.chapter6


object TestObject extends App {
	val converterGallonsToLiters: UnitConversion = GallonsToLiters 
	println(converterGallonsToLiters.convert(10))
	
	val converterInchesToCentimeters :UnitConversion = InchesToCentimeters
	println(converterInchesToCentimeters.convert(10))
	
	val converterMilesToKilometers :UnitConversion = MilesToKilometers
	println(converterMilesToKilometers.convert(10))
	
	val x: Point = Point(3, 4)
	println(x.getY())
	
	for(s <- args.reverse){
	  print(s + " ")
	}
	
	val card = CardsTypes.HEARTS
	println(card)
	
	def checkIfRedLocal(card: CardsTypes.CardColor):Boolean = {
	  card == CardsTypes.HEARTS || card == CardsTypes.DIAMONDS
	}
	
	println(checkIfRedLocal(card));
	println(CardsTypes.checkIfRed(card));
	
	println(for (color <- RGBColorCube.values) yield ("0x%06x".format(0xFFFFFF & color.id), color))
}