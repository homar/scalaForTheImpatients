package pl.homar.scala.impatients.chapter11

object RichFile { 

	
	def unapplySeq(s: String): Option[Seq[String]] = {
		if (s.trim == "") None else Some(s.trim.split("/")) 
	}
}