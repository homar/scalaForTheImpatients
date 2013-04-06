object TestWorkshit {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(13); val res$0 = 
  "hello"(4)
  import scala.math._;System.out.println("""res0: Char = """ + $show(res$0));$skip(44); val res$1 = 
  3 - sqrt (sqrt (3));System.out.println("""res1: Double = """ + $show(res$1));$skip(13); val res$2 = 
  "crazy"* 3;System.out.println("""res2: String = """ + $show(res$2));$skip(12); val res$3 = 
  10 max 11;System.out.println("""res3: Int = """ + $show(res$3));$skip(15); val res$4 = 
  pow(2, 1024);System.out.println("""res4: Double = """ + $show(res$4));$skip(20); 
  val x = BigInt(2);System.out.println("""x  : scala.math.BigInt = """ + $show(x ));$skip(14); val res$5 = 
  x.pow(1024)
  import scala.BigInt._
  import scala.util.Random;System.out.println("""res5: scala.math.BigInt = """ + $show(res$5));$skip(80); val res$6 = 
  probablePrime(100, Random);System.out.println("""res6: scala.math.BigInt = """ + $show(res$6));$skip(30); 
  val y = BigInt(100, Random);System.out.println("""y  : scala.math.BigInt = """ + $show(y ));$skip(17); val res$7 = 
  y.toString(36);System.out.println("""res7: String = """ + $show(res$7))}
}
