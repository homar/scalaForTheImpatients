package pl.homar.scala.impatients.chapter6

class Point(x: Int, y: Int) extends java.awt.Point(x,y){

}
object Point{
  def apply(x: Int, y: Int) = new Point(x,y)
}