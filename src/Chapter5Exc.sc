object Chapter5Exc {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  class Counter{
  	private var value = 0
  	def increment() = {
  		if(value < Int.MaxValue)
  		value += 1
  	}
  	
  	def current() = value
  }
  
  class BankAccount {
  	private var accBalance: Double = 0.0
  	
  	def deposit(value: Double) {
  		accBalance += value
  	}
  	
  	def withdraw(red: Double) {
  		accBalance -= red
  	}
  	
  	def balance = accBalance
  }
  
  class Time(val hours: Int, val minutes: Int){
  	
  	def before(t: Time): Boolean = {
  		t.hours < hours || (t.hours == hours && t.minutes < minutes)
  	}
  }
  
  import scala.reflect.BeanProperty
  class Student(@BeanProperty val name: String, @BeanProperty val id: Long){
  	
  }
  
  val s = new Student("dupa", 1234)               //> s  : Chapter5Exc.Student = Chapter5Exc$$anonfun$main$1$Student$1@4282c39f
  s.getName                                       //> res0: String = dupa
  
  
  class Person(var ageParam: Int){
  	val age = if (ageParam < 0) 0 else ageParam
  	
  }
  
  class MyPerson(_firstName: String) {
  	val firstName = _firstName.split(" ")(0)
  	val  lastName = _firstName.split(" ")(1)
  }
  
  val ja = new MyPerson("Konrad Dziedzic")        //> ja  : Chapter5Exc.MyPerson = Chapter5Exc$$anonfun$main$1$MyPerson$1@69ac44c
                                                  //| 2
  ja.firstName                                    //> res1: String = Konrad
  
  class Car(val manufacturer: String, val model: String, val year: Int, var licence: String){
 		def this(manufacturer: String, model: String) {
 			this(manufacturer, model, -1, "")
 		}
 		
 		def this(manufacturer: String, model: String, year: Int) {
 			this(manufacturer, model, year, "")
 		}
 		
 		def this(manufacturer: String, model: String, licence: String) {
 			this(manufacturer, model, -1, licence)
 		}
  }
}