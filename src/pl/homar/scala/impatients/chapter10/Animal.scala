package pl.homar.scala.impatients.chapter10

trait Animal {
	val sound: String
	def name: String = ""
	def giveSound = println(sound + " " + name)
}

trait Endothermy 
trait Hypothermy

trait Mammal extends Animal with Hypothermy

class Dog extends Mammal{
  val sound = "How How"
    override def name = "rex" 
}

class Cat extends Mammal { 
  val sound = "MIAAAAU"
  override def name = "Kitek"
  override def giveSound = {
    println ("Im a cat")
    super.giveSound
  }    
}