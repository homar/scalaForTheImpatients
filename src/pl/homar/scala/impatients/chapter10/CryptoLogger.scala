package pl.homar.scala.impatients.chapter10

class CryptoLogger {
	lazy val getKey = 3
	def log(msg: String){
	  val newMsg = for(c <- msg) yield (c+ getKey).toChar
	  println(newMsg)
	}
}

class cryptoLoggerImp extends CryptoLogger{
  override lazy val getKey = -3;
}