package pl.homar.scala.impatients.chapter7

class UserPropReader {
  def readData() ={
	import java.lang.System._
	val props = getProperties()
	val user = props.getProperty("user.name")
	println(user)
	val password = console().readPassword()
	if(password.eq("secret")) println("yo")
	else println(password)
	
  }
}