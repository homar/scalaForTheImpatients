package pl.homar.scala.impatients.chapter10

import java.io.FileInputStream

object Main extends App {
	
  val cryptoLogger = new CryptoLogger
  cryptoLogger.log("dupa")

  val cryptoLoggerImpl = new cryptoLoggerImp
  cryptoLoggerImpl.log("dupa")
  
  val myPoint = new MyPoint(1,2);

  val dog = new Dog
  val cat = new Cat
  dog.giveSound
  cat.giveSound
  
  val data1 = new FileInputStream("test.txt") 
  for(i <- 1 to 10 ) println(data1.read)
  
  val data2 = new FileInputStream("test.txt") with BufferedInputStreamLike with PrintLogger
  for(i <- 1 to 15 ) println(data2.read)
  
  val data3 = new FileInputStream("test.txt") with IterableInputStream 
  for(i <- 1 to 10 ) println(data3.read)
}

