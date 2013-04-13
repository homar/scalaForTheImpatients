package pl.homar.scala.impatients.chapter10

import java.io.InputStream

trait IterableInputStream extends InputStream with Iterable[Byte]{
	
	class InputStreamIterator(outer: IterableInputStream) extends Iterator[Byte] {
	  def hasNext: Boolean = {
	    outer.available() > 0
	  }
	  def next = {
	    outer.read.toByte
	  }
	}
	
	def iterator = new InputStreamIterator(this)
	
}