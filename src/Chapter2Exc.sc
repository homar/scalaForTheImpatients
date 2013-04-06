object Chapter2Exc {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def signum(number :Int) = {
  	if(number > 0) 1
  	else -1
  }                                               //> signum: (number: Int)Int
  
  signum(1000)                                    //> res0: Int = 1
  signum(-10)                                     //> res1: Int = -1

	for(i <- (1 to 10).reverse) println(i)    //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
  def countdown(number: Int) {
  	for(i <- (0 to number).reverse) println(i)
  }                                               //> countdown: (number: Int)Unit
  
  countdown(10)                                   //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
	var x: Long = 1                           //> x  : Long = 1
	"Hello".foreach(x*=_)
  x                                               //> res2: Long = 9415087488
  
  def product(s: String): Long = {
  	var x:Long = 1;
  	s.foreach(x*=_)
  	x
  }                                               //> product: (s: String)Long
  
  product("Hello")                                //> res3: Long = 9415087488
  
  def productRec(s: String): Long ={
  	if(s.isEmpty()) 1
  	else s.head.toInt * productRec(s.tail)
  }                                               //> productRec: (s: String)Long
  
  productRec("Hello")                             //> res4: Long = 9415087488
  
  def power(x: Int, n: Int): Double = {
  	if(n == 0) 1
  	else if (n < 0){
  		1/power(x, -n)
  	}else if(n > 0 && n % 2 == 0){
  		power(x, n/2)*power(x, n/2)
  	}else {
  		x*power(x, n-1)
  	}
  }                                               //> power: (x: Int, n: Int)Double
  
  power(4,-1)                                     //> res5: Double = 0.25
}