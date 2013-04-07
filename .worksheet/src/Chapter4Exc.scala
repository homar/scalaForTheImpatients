object Chapter4Exc {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(54); 
  val myGizmos = Map("d" -> 12, "c" -> 13, "f" -> 15);System.out.println("""myGizmos  : scala.collection.immutable.Map[String,Int] = """ + $show(myGizmos ));$skip(43); val res$0 = 
  for((k,v) <- myGizmos) yield  (k, v*0.9);System.out.println("""res0: <error> = """ + $show(res$0));$skip(120); 
	val in = new java.util.Scanner(new java.io.File("C:\\Users\\Konrad\\workspaceScala\\scalaForTheImpatients\\test.txt"));System.out.println("""in  : <error> = """ + $show(in ));$skip(69); 
	var wordsMap = new scala.collection.immutable.HashMap[String, Int];System.out.println("""wordsMap  : scala.collection.immutable.HashMap[String,Int] = """ + $show(wordsMap ));$skip(131); ;
	while(in.hasNext()){
		val world = in.next
		val value = wordsMap.getOrElse(world, 0)
		wordsMap = wordsMap + (world -> value)
	};$skip(10); val res$1 = 
	wordsMap;System.out.println("""res1: scala.collection.immutable.HashMap[String,Int] = """ + $show(res$1));$skip(12); val res$2 = 
	in.close();System.out.println("""res2: <error> = """ + $show(res$2));$skip(77); 
	
	var sortedWordsMap = new scala.collection.immutable.TreeMap[String, Int];System.out.println("""sortedWordsMap  : <error> = """ + $show(sortedWordsMap ));$skip(122); ;
  val in2 = new java.util.Scanner(new java.io.File("C:\\Users\\Konrad\\workspaceScala\\scalaForTheImpatients\\test.txt"));System.out.println("""in2  : <error> = """ + $show(in2 ));$skip(151); 
	while(in2.hasNext()){
		val world = in2.next
		val value = sortedWordsMap.getOrElse(world, 0)
		sortedWordsMap = sortedWordsMap + (world -> value)
	};$skip(16); val res$3 = 
	sortedWordsMap;System.out.println("""res3: <error> = """ + $show(res$3));$skip(13); val res$4 = 
	in2.close();System.out.println("""res4: <error> = """ + $show(res$4));$skip(79); 
	
	val daysOfTheWeek = new scala.collection.mutable.LinkedHashMap[String, Int];System.out.println("""daysOfTheWeek  : scala.collection.mutable.LinkedHashMap[String,Int] = """ + $show(daysOfTheWeek ));$skip(53); 
	daysOfTheWeek("Monday") = java.util.Calendar.MONDAY;$skip(55); 
	daysOfTheWeek("Tuesday") = java.util.Calendar.TUESDAY;$skip(59); 
	daysOfTheWeek("Wednesday") = java.util.Calendar.WEDNESDAY;$skip(57); 
	daysOfTheWeek("Thursday") = java.util.Calendar.THURSDAY;$skip(53); 
	daysOfTheWeek("Friday") = java.util.Calendar.FRIDAY;$skip(57); 
	daysOfTheWeek("Saturday") = java.util.Calendar.SATURDAY;$skip(53); 
	daysOfTheWeek("Sunday") = java.util.Calendar.SUNDAY;$skip(24); val res$5 = 
	
	daysOfTheWeek.values;System.out.println("""res5: Iterable[Int] = """ + $show(res$5));$skip(82); 
	
	val props = scala.collection.JavaConversions asScalaMap (System getProperties);System.out.println("""props  : scala.collection.mutable.Map[String,String] = """ + $show(props ));$skip(60); 
	val maxLength = props.keySet.toList.maxBy(_.length).length;System.out.println("""maxLength  : <error> = """ + $show(maxLength ));$skip(78); 
	
	for((k,v) <- props)
		println(k + " "*(maxLength - k.length()) + "| " + v);$skip(206); 
		
	def minmax(values: Array[Int]):(Int,Int) = {
		var min = Int.MaxValue;
		var max = Int.MinValue;
		for(i <- values){
			if(i > max){
				max = i
			}
			if(i < min){
				min = i
			}
		}
		(min,max)
	};System.out.println("""minmax: (values: Array[Int])(Int, Int)""");$skip(27); val res$6 = 

	minmax(Array(2,1,3,5,4));System.out.println("""res6: (Int, Int) = """ + $show(res$6));$skip(24); val res$7 = 
	"Helloo".zip("Worldd");System.out.println("""res7: <error> = """ + $show(res$7))}
}
