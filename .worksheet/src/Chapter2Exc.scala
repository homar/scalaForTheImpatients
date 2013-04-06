object Chapter2Exc {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(65); 
  def signum(number :Int) = {
  	if(number > 0) 1
  	else -1
  };System.out.println("""signum: (number: Int)Int""");$skip(18); val res$0 = 
  
  signum(1000);System.out.println("""res0: Int = """ + $show(res$0));$skip(14); val res$1 = 
  signum(-10);System.out.println("""res1: Int = """ + $show(res$1));$skip(41); 

	for(i <- (1 to 10).reverse) println(i);$skip(81); 
  def countdown(number: Int) {
  	for(i <- (0 to number).reverse) println(i)
  };System.out.println("""countdown: (number: Int)Unit""");$skip(19); 
  
  countdown(10);$skip(17); 
	var x: Long = 1;System.out.println("""x  : Long = """ + $show(x ));$skip(23); 
	"Hello".foreach(x*=_);$skip(4); val res$2 = 
  x;System.out.println("""res2: Long = """ + $show(res$2));$skip(85); 
  
  def product(s: String): Long = {
  	var x:Long = 1;
  	s.foreach(x*=_)
  	x
  };System.out.println("""product: (s: String)Long""");$skip(22); val res$3 = 
  
  product("Hello");System.out.println("""res3: Long = """ + $show(res$3));$skip(107); 
  
  def productRec(s: String): Long ={
  	if(s.isEmpty()) 1
  	else s.head.toInt * productRec(s.tail)
  };System.out.println("""productRec: (s: String)Long""");$skip(25); val res$4 = 
  
  productRec("Hello");System.out.println("""res4: Long = """ + $show(res$4));$skip(204); 
  
  def power(x: Int, n: Int): Double = {
  	if(n == 0) 1
  	else if (n < 0){
  		1/power(x, -n)
  	}else if(n > 0 && n % 2 == 0){
  		power(x, n/2)*power(x, n/2)
  	}else {
  		x*power(x, n-1)
  	}
  };System.out.println("""power: (x: Int, n: Int)Double""");$skip(17); val res$5 = 
  
  power(4,-1);System.out.println("""res5: Double = """ + $show(res$5))}
}
