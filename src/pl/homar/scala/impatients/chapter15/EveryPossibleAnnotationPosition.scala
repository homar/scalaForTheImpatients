package pl.homar.scala.impatients.chapter15

@deprecated class EveryPossibleAnnotationPosition {
	
	@deprecated val s = "string"
  
	@deprecated def nothingSpecial = {
	  println("Nothing Special")
	  @deprecated var i = 1
	}
}