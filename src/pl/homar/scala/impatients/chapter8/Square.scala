package pl.homar.scala.impatients.chapter8

class Square(p: java.awt.Point, w: Double) extends java.awt.Rectangle(p.getX().toInt, p.getY().toInt, w.toInt, w.toInt) {
	
  def this(w: Double = 0.0) = {
	  this(new java.awt.Point(), w)
	}
}