package pl.homar.scala.impatients.chapter10

trait RectangleLike {
	def getHeigth(): Double
	def getWidth(): Double
	def getX(): Double
	def getY(): Double
	def setFrame(x: Double, y: Double, w: Double, h: Double)
	
	def translate(dx: Double, dy: Double){
	  setFrame(getX() + dx, getY()+dy, getWidth(), getHeigth)
	}
	
	def grow(h: Int, v: Int){
	  setFrame(getX(), getY(), h,v)
	}

}