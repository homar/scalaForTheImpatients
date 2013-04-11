package pl.homar.scala.impatients.chapter8

abstract class Shape(p: Point) {
	def centerPoint(): Point
}

class Rectangle(p: Point, x: Double, y: Double) extends Shape(p){
  def centerPoint = {
    p
  }
}

class Circle(p: Point, r: Double) extends Shape(p){
  def centerPoint = {
    p
  }
}