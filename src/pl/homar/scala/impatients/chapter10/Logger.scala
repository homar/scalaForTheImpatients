package pl.homar.scala.impatients.chapter10

trait Logger {
	def log(msg: String)
}

trait NoneLogger extends Logger {
	def log(msg: String) = {}
}

trait PrintLogger extends Logger {
	def log(msg: String) = println(msg)
}