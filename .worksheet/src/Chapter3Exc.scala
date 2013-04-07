object Chapter3Exc {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet")
 import scala.util.Random
 import scala.collection.mutable.ArrayBuffer;$skip(91); 
 var r = new Random;System.out.println("""r  : scala.util.Random = """ + $show(r ));$skip(186); 
 def createArrayOfRandomInt(n: Int, r: Random): Array[Int] ={
 	var tmp = for(i <- 0 to n) yield r.nextInt(n)
 	val res = new ArrayBuffer[Int](n)
 	for(i <- tmp) res+=i
 	res.toArray
 };System.out.println("""createArrayOfRandomInt: (n: Int, r: scala.util.Random)Array[Int]""");$skip(33); val res$0 = 
 
 createArrayOfRandomInt(10, r);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(28); 
 val tab = Array(1,2,3,4,5);System.out.println("""tab  : Array[Int] = """ + $show(tab ));$skip(129); 
 for(i <- 0 to tab.length ; j <- i to i+1 if j < tab.length && i % 2 == 0){
 	val sw = tab(i)
 	tab(i) = tab(j)
 	tab(j) = sw
 };$skip(5); val res$1 = 
 tab;System.out.println("""res1: Array[Int] = """ + $show(res$1));$skip(47); 
 
 val tab2: Array[Int] = Array(1,2,3,4,5,6,7);System.out.println("""tab2  : Array[Int] = """ + $show(tab2 ));$skip(160); val res$2 = 

 (for(i <- 0 until tab2.length)yield{
 		if (i == tab2.length - 1 && i % 2 == 0) tab2(i)
 		else if(i % 2 == 1) tab2(i - 1)
 		else tab2(i + 1)
 	}
 ).toArray;System.out.println("""res2: Array[Int] = """ + $show(res$2));$skip(168); 
 	
 def sortArray(arr: Array[Int]): Array[Int] = {
 	val posArr = for(i <- arr if( i >= 0)) yield i
 	val negArr = for(i <- arr if i < 0) yield i
 	posArr ++ negArr
 };System.out.println("""sortArray: (arr: Array[Int])Array[Int]""");$skip(38); val res$3 = 
 
 sortArray(Array(-1,2,3,-4,4,5,-2));System.out.println("""res3: Array[Int] = """ + $show(res$3));$skip(32); 
 
 val dou = Array(1.0,3.0,2.0);System.out.println("""dou  : Array[Double] = """ + $show(dou ));$skip(18); 
 
 var sum = 0.0;System.out.println("""sum  : Double = """ + $show(sum ));$skip(24); ;
 for(i <- dou) sum += i;$skip(18); val res$4 = 
 
 sum/dou.length;System.out.println("""res4: Double = """ + $show(res$4));$skip(22); val res$5 = 
 
 dou.sorted.reverse;System.out.println("""res5: Array[Double] = """ + $show(res$5));$skip(33); 
 var dupArr = Array(1,1,2,2,3,3);System.out.println("""dupArr  : Array[Int] = """ + $show(dupArr ));$skip(17); val res$6 = 
 dupArr.distinct;System.out.println("""res6: Array[Int] = """ + $show(res$6));$skip(56); 
 	
 	val timeZones = java.util.TimeZone.getAvailableIDs;System.out.println("""timeZones  : Array[String] = """ + $show(timeZones ));$skip(64); val res$7 = 
  timeZones.filter(_.contains("America")).map(_.drop(8)).sorted
  
  import java.awt.datatransfer._;System.out.println("""res7: Array[String] = """ + $show(res$7));$skip(120); 
  val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  import scala.collection.mutable.Buffer
  import scala.collection.JavaConversions.asScalaBuffer;System.out.println("""flavors  : java.awt.datatransfer.SystemFlavorMap = """ + $show(flavors ));$skip(177); 
	val buf : Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor);System.out.println("""buf  : scala.collection.mutable.Buffer[String] = """ + $show(buf ))}
  
 	
}
