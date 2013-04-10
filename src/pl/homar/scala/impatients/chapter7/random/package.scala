package pl.homar.scala.impatients.chapter7

package object random {
  private val a = 1664525
  private val b = 1013904223
  private val n = 32
  private var previous = 1
  
  def nextInt():Int = {
	previous = previous * a + b % (scala.math.pow(2, n)).toInt 
	previous
  }
  
  def nextDouble():Double = {
    val previousDouble = (previous * a).toDouble + (b % (scala.math.pow(2, n))).toDouble
    previous = previousDouble.toInt
	previousDouble
  }
  
  def setSeed(seed: Int) = {
    previous = seed
  }
}