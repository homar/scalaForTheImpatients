package pl.homar.scala.impatients.chapter11

class ASCIIArt(val art: String) {

	def +(other: ASCIIArt) = new ASCIIArt(
		art.split("\n").zip(other.art.split("\n")).map(x => x._1 + x._2).mkString("\n")
	)

	def ^(other: ASCIIArt) = new ASCIIArt(
		art + "\n" + other.art
	)

	override def toString = art
}

object ASCIIArt {
  val cat = new ASCIIArt(
""" /\_/\ 
( ' ' )
(  -  )
 | | | 
(__|__)""")
  
  val thing = new ASCIIArt(
"""   -----
 / Hello \
<  Scala |
 \ Coder /
   -----""")
}