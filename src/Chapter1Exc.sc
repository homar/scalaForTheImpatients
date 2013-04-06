object TestWorkshit {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  "hello"(4)                                      //> res0: Char = o
  import scala.math._
  3 - sqrt (sqrt (3))                             //> res1: Double = 1.6839259870475076
  "crazy"* 3                                      //> res2: String = crazycrazycrazy
  10 max 11                                       //> res3: Int = 11
  pow(2, 1024)                                    //> res4: Double = Infinity
  val x = BigInt(2)                               //> x  : scala.math.BigInt = 2
  x.pow(1024)                                     //> res5: scala.math.BigInt = 17976931348623159077293051907890247336179769789423
                                                  //| 0657273430081157732675805500963132708477322407536021120113879871393357658789
                                                  //| 7688144166224928474306394741243777678934248654852763022196012460941194530829
                                                  //| 5208500576883815068234246288147391311054082723716335051068458629823994724593
                                                  //| 8479716304835356329624224137216
  import scala.BigInt._
  import scala.util.Random
  probablePrime(100, Random)                      //> res6: scala.math.BigInt = 917056065887701864165245188683
  val y = BigInt(100, Random)                     //> y  : scala.math.BigInt = 375494196197591093730653075485
  y.toString(36)                                  //> res7: String = 10ekkndjk8bebalgvpr1
}