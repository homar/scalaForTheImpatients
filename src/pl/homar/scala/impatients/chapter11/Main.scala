package pl.homar.scala.impatients.chapter11

object Main extends App {

  val f1 = new Fraction(1,2)
  val f2 = new Fraction(1,3)
  
  println( f1+f2)
  println( f1-f2)
  println( f1*f2)
  println( f1/f2)
  
  val m1 = new Money(1,10)
  val m2 = new Money(1, 101)
  
  println(m1+m2)
  println(m2 - m1)
  println(m1 == m2)
  println(m1 == m1)
  println(m1 < m2)
  
  val t = Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM,.NET"
  println(t)
  
  println(ASCIIArt.cat + ASCIIArt.thing)
  println(ASCIIArt.cat ^ ASCIIArt.thing)
  
  val x = new BitSequence
  println(x)
  x(4) = 1;
  println(x)
  x(4) = 1;
  println(x(4))
  
  val matrix1 = new Matrix(2,2)
  val matrix2 = new Matrix(2,2)
  
  println(matrix1);
  matrix1(1,1) = 2.0
  println(matrix1);
  
  println(matrix1 * matrix2)
  
  
  val RichFile(first, middle, last) = "home/user/text.txt"

  println("First: %s, Middle: %s, Last: %s".format(first, middle, last))
}