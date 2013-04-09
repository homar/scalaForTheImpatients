package pl.homar.scala.impatients.chapter6

abstract class UnitConversion {
	def convert(in: Double): Double
}

object InchesToCentimeters extends UnitConversion{
  private val inchToCentimeter: Double = 2.54
  
  def convert(in: Double): Double = {
    inchToCentimeter *in
  }
}

object GallonsToLiters extends UnitConversion{
  private val gallonToLiter: Double = 3.78541178
  
  def convert(in: Double): Double = {
    gallonToLiter * in
  }
}

object MilesToKilometers extends UnitConversion {
  private val mileToKilometer: Double = 1.609344 
  
  def convert(in: Double): Double = {
    mileToKilometer * in
  }
}
