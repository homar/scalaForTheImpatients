package pl.homar.scala.impatients.chapter10

import java.io.BufferedInputStream
import java.io.InputStream

trait BufferedInputStreamLike{
	this: InputStream with Logger =>
	  
	  val BUFF_SIZE  = 10
	  private val buffer = new Array[Byte](BUFF_SIZE)
	  private var buffsize = 0
	  private var position = 0
	  
	  override def read(): Int = {
	    if(position >= buffsize ){
	      buffsize = this.read(buffer, 0 , BUFF_SIZE)
	      log("buffered %d bytes: %s".format(buffsize, buffer.mkString(", ")))
	      if (buffsize > 0 ) -1
	      position = 0
	    }
	    position += 1
	    buffer(position-1)
	  }
}