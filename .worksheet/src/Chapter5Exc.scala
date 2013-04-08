object Chapter5Exc {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet")
  
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
  	
  };$skip(706); 
  
  val s = new Student("dupa", 1234);System.out.println("""s  : Chapter5Exc.Student = """ + $show(s ));$skip(12); val res$0 = 
  s.getName
  
  
  class Person(var ageParam: Int){
  	val age = if (ageParam < 0) 0 else ageParam
  	
  }
  
  class MyPerson(_firstName: String) {
  	val firstName = _firstName.split(" ")(0)
  	val  lastName = _firstName.split(" ")(1)
  };System.out.println("""res0: String = """ + $show(res$0));$skip(276); 
  
  val ja = new MyPerson("Konrad Dziedzic");System.out.println("""ja  : Chapter5Exc.MyPerson = """ + $show(ja ));$skip(15); val res$1 = 
  ja.firstName;System.out.println("""res1: String = """ + $show(res$1))}
  
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
