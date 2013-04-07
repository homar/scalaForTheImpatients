object Chapter4Exc {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val myGizmos = Map("d" -> 12, "c" -> 13, "f" -> 15)
                                                  //> myGizmos  : scala.collection.immutable.Map[String,Int] = Map(d -> 12, c -> 1
                                                  //| 3, f -> 15)
  for((k,v) <- myGizmos) yield  (k, v*0.9)        //> res0: <error> = Map(d -> 10.8, c -> 11.700000000000001, f -> 13.5)
	val in = new java.util.Scanner(new java.io.File("C:\\Users\\Konrad\\workspaceScala\\scalaForTheImpatients\\test.txt"))
                                                  //> in  : <error> = java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0
                                                  //| ][match valid=false][need input=false][source closed=false][skipped=false][g
                                                  //| roup separator=\ ][decimal separator=\,][positive prefix=][negative prefix=\
                                                  //| Q-\E][positive suffix=][negative suffix=][NaN string=\Q?\E][infinity string=
                                                  //| \Q?\E]
	var wordsMap = new scala.collection.immutable.HashMap[String, Int];
                                                  //> wordsMap  : scala.collection.immutable.HashMap[String,Int] = Map()
	while(in.hasNext()){
		val world = in.next
		val value = wordsMap.getOrElse(world, 0)
		wordsMap = wordsMap + (world -> value)
	}
	wordsMap                                  //> res1: scala.collection.immutable.HashMap[String,Int] = Map(METAFILEPICT) -> 
                                                  //| 0, 6, -> 0, Random -> 0, America/Anchorage, -> 0, Edmonton, -> 0, Array(1, -
                                                  //| > 0, Etc/GMT+11, -> 0, Coral_Harbour, -> 0, posArr -> 0, 0)) -> 0, Bahia_Ban
                                                  //| deras, -> 0, ={ -> 0, Eirunepe, -> 0, uesas, -> 0, scala.collection.mutable.
                                                  //| ArrayBuffer -> 0, US/Pacific, -> 0, America/Adak, -> 0, //| -> 0, ENH -> 0, 
                                                  //| for(i -> 0, Chihuahua, -> 0, dupArr.distinct -> 0, Belize, -> 0, America/Sit
                                                  //| ka, -> 0, 7) -> 0, (arr: -> 0, timeZones.filter(_.contains("America")).map(_
                                                  //| .drop(8)).sorted -> 0, Array(2, -> 0, 3.0, -> 0, Dominica, -> 0, Etc/GMT+10,
                                                  //|  -> 0, METAFILE, -> 0, 0) -> 0, Dawson, -> 0, ).toArray -> 0, % -> 0, otonga
                                                  //| , -> 0, Argentina/Jujuy, -> 0, Barbados, -> 0, ica/Hermosillo, -> 0, tab2(i 
                                                  //| -> 0, Danmarkshavn, -> 0, Pacific/Marq -> 0, ntina/Cordoba, -> 0, Cayman, ->
                                                  //|  0, Bogo -> 0, Array(Adak, -> 0, ica/Whitehorse, -> 0, } -> 0, America/Cambr
                                                  //| idge_Bay, -> 0, Chapter3
                                                  //| Output exceeds cutoff limit.
	in.close()                                //> res2: <error> = ()
	
	var sortedWordsMap = new scala.collection.immutable.TreeMap[String, Int];
                                                  //> sortedWordsMap  : <error> = Map()
  val in2 = new java.util.Scanner(new java.io.File("C:\\Users\\Konrad\\workspaceScala\\scalaForTheImpatients\\test.txt"))
                                                  //> in2  : <error> = java.util.Scanner[delimiters=\p{javaWhitespace}+][position=
                                                  //| 0][match valid=false][need input=false][source closed=false][skipped=false][
                                                  //| group separator=\ ][decimal separator=\,][positive prefix=][negative prefix=
                                                  //| \Q-\E][positive suffix=][negative suffix=][NaN string=\Q?\E][infinity string
                                                  //| =\Q?\E]
	while(in2.hasNext()){
		val world = in2.next
		val value = sortedWordsMap.getOrElse(world, 0)
		sortedWordsMap = sortedWordsMap + (world -> value)
	}
	sortedWordsMap                            //> res3: <error> = Map(% -> 0, && -> 0, (arr: -> 0, (for(i -> 0, (i -> 0, (n: -
                                                  //| > 0, ).toArray -> 0, + -> 0, ++ -> 0, += -> 0, , -> 0, - -> 0, -1, -> 0, -2)
                                                  //|  -> 0, -4, -> 0, //> -> 0, //| -> 0, /Metlakatla, -> 0, 0 -> 0, 0) -> 0, 0))
                                                  //|  -> 0, 0){ -> 0, 0, -> 0, 0.0 -> 0, 0.0; -> 0, 1 -> 0, 1) -> 0, 1, -> 0, 1.0
                                                  //| ) -> 0, 2 -> 0, 2, -> 0, 2.0 -> 0, 2.0) -> 0, 2.0, -> 0, 3) -> 0, 3, -> 0, 3
                                                  //| .0, -> 0, 4, -> 0, 5) -> 0, 5, -> 0, 6, -> 0, 7) -> 0, 7, -> 0, 8, -> 0, : -
                                                  //| > 0, ; -> 0, < -> 0, <- -> 0, = -> 0, == -> 0, ={ -> 0, >= -> 0, AST, -> 0, 
                                                  //| Am -> 0, Ame -> 0, Amer -> 0, America -> 0, America/Adak, -> 0, America/Anch
                                                  //| orage, -> 0, America/Boise, -> 0, America/Cambridge_Bay, -> 0, America/Chihu
                                                  //| ahua, -> 0, America/Dawson, -> 0, America/Dawson_Creek, -> 0, America/Denver
                                                  //| , -> 0, America/Edmonton, -> 0, America/Ensenada, -> 0, America/Juneau, -> 0
                                                  //| , America/Los_Angeles, -> 0, America/Nome, -> 0, America/Santa_Isabel, -> 0,
                                                  //|  America/Sitka, -> 0, Am
                                                  //| Output exceeds cutoff limit.
	in2.close()                               //> res4: <error> = ()
	
	val daysOfTheWeek = new scala.collection.mutable.LinkedHashMap[String, Int]
                                                  //> daysOfTheWeek  : scala.collection.mutable.LinkedHashMap[String,Int] = Map()
                                                  //| 
	daysOfTheWeek("Monday") = java.util.Calendar.MONDAY
	daysOfTheWeek("Tuesday") = java.util.Calendar.TUESDAY
	daysOfTheWeek("Wednesday") = java.util.Calendar.WEDNESDAY
	daysOfTheWeek("Thursday") = java.util.Calendar.THURSDAY
	daysOfTheWeek("Friday") = java.util.Calendar.FRIDAY
	daysOfTheWeek("Saturday") = java.util.Calendar.SATURDAY
	daysOfTheWeek("Sunday") = java.util.Calendar.SUNDAY
	
	daysOfTheWeek.values                      //> res5: Iterable[Int] = MapLike(2, 3, 4, 5, 6, 7, 1)
	
	val props = scala.collection.JavaConversions asScalaMap (System getProperties)
                                                  //> props  : scala.collection.mutable.Map[String,String] = Map(java.runtime.nam
                                                  //| e -> Java(TM) SE Runtime Environment, sun.boot.library.path -> C:\Program F
                                                  //| iles\Java\jre7\bin, java.vm.version -> 23.7-b01, user.country.format -> PL,
                                                  //|  java.vm.vendor -> Oracle Corporation, java.vendor.url -> http://java.oracl
                                                  //| e.com/, path.separator -> ;, java.vm.name -> Java HotSpot(TM) 64-Bit Server
                                                  //|  VM, file.encoding.pkg -> sun.io, user.country -> US, user.script -> "", su
                                                  //| n.java.launcher -> SUN_STANDARD, sun.os.patch.level -> "", java.vm.specific
                                                  //| ation.name -> Java Virtual Machine Specification, user.dir -> D:\eclipse_sc
                                                  //| ala, java.runtime.version -> 1.7.0_13-b20, java.awt.graphicsenv -> sun.awt.
                                                  //| Win32GraphicsEnvironment, java.endorsed.dirs -> C:\Program Files\Java\jre7\
                                                  //| lib\endorsed, os.arch -> amd64, java.io.tmpdir -> C:\Users\Konrad\AppData\L
                                                  //| ocal\Temp\, line.separator -> "
                                                  //| ", java.vm.specification.vendor -> Oracle Corporation, user.varian
                                                  //| Output exceeds cutoff limit.
	val maxLength = props.keySet.toList.maxBy(_.length).length
                                                  //> maxLength  : <error> = 29
	
	for((k,v) <- props)
		println(k + " "*(maxLength - k.length()) + "| " + v)
                                                  //> java.runtime.name            | Java(TM) SE Runtime Environment
                                                  //| sun.boot.library.path        | C:\Program Files\Java\jre7\bin
                                                  //| java.vm.version              | 23.7-b01
                                                  //| user.country.format          | PL
                                                  //| java.vm.vendor               | Oracle Corporation
                                                  //| java.vendor.url              | http://java.oracle.com/
                                                  //| path.separator               | ;
                                                  //| java.vm.name                 | Java HotSpot(TM) 64-Bit Server VM
                                                  //| file.encoding.pkg            | sun.io
                                                  //| user.country                 | US
                                                  //| user.script                  | 
                                                  //| sun.java.launcher            | SUN_STANDARD
                                                  //| sun.os.patch.level           | 
                                                  //| java.vm.specification.name   | Java Virtual Machine Specification
                                                  //| user.dir                     | D:\eclipse_scala
                                                  //| java.runtime.version         | 1.7.0_13-b20
                                                  //| java.awt.graphicsenv         | sun.awt.Win32GraphicsEnvironment
                                                  //| java.endorsed.dirs           | C:\Program Files\Java\jre7\lib\endorsed
                                                  //| os.arch     
                                                  //| Output exceeds cutoff limit.
		
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
	}                                         //> minmax: (values: Array[Int])(Int, Int)

	minmax(Array(2,1,3,5,4))                  //> res6: (Int, Int) = (1,5)
	"Helloo".zip("Worldd")                    //> res7: <error> = Vector((H,W), (e,o), (l,r), (l,l), (o,d), (o,d))
}