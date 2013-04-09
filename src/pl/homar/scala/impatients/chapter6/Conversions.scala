package pl.homar.scala.impatients.chapter6

object Conversions {
	
	private val inchToCentimeter: Double = 2.54
	private val gallonToLiter: Double = 3.78541178
	private val mileToKilometer: Double = 1.609344 
  
	def indechToCentimeters(input: Double): Double = {
	  inchToCentimeter * input
	}
	
	def gallonsToLiters(input: Double): Double = {
	  gallonToLiter * input
	}
	
	def milesToKilometers(input: Double): Double = {
	  mileToKilometer * input
	}
}