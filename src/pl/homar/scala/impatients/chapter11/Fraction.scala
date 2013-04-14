package pl.homar.scala.impatients.chapter11

import scala.math.abs

class Fraction(n: Int, d: Int) {
	private val num = if (d == 0) 1
	else n * sign(d)/gcd(n,d)
	
	private val den = if(d == 0) 0
	else d * sign(d)/gcd(n,d);
	
	override def toString = num +"/" + den
	
	def sign(a: Int) = if(a > 0) 1 else if (a < 0) -1 else 0
	
	def gcd(a: Int, b: Int): Int = if( b== 0) abs(a) else gcd(b, a % b)
	
	def +(other: Fraction) = {
	  var l1 = num * other.den
	  var l2 = other.num * den
	  var m = den * other.den
	  val cgcd = gcd(l1+l2,m)
	  val l = (l1+l2)/cgcd
	  m = m/cgcd
	  new Fraction(l,m)
	}
	
	def -(other: Fraction) = {
	  var l1 = num * other.den
	  var l2 = other.num * den
	  var m = den * other.den
	  val cgcd = gcd(l1-l2,m)
	  val l = (l1-l2)/cgcd
	  m = m/cgcd
	  new Fraction(l,m)
	}
	
	def *(other: Fraction) = {
	  val l = num * other.num
	  val m = den * other.den
	  val cgcd = gcd(l,m)
	  new Fraction(l/cgcd, m/cgcd)
	}
	
	def /(other: Fraction) = {
	  this * (new Fraction(other.den, other.num))
	}
}