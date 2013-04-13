package pl.homar.scala.impatients.chapter10

import java.awt.Point
import scala.math.Ordered

class OrderedPoint extends Point with Ordered[Point] {
	def compare(p: Point): Int = {
	  if(this.getX() == p.getX()) (this.getY() - p.getY()).toInt
	  else (this.getX() - p.getX()).toInt
	}
}