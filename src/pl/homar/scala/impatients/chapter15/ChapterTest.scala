package pl.homar.scala.impatients.chapter15
import org.junit._
import java.util.ArrayList

class ChapterTest() {

  @Test(expected=classOf[IndexOutOfBoundsException])
  def testExpected {
    new ArrayList().get(1)
  }
  
  @Test(timeout=350)
  def testTimeOut{
    println("test")
  }
  
  @Test
  def testWithoutParameters {
    println("test2")
  }
  
  @Test(expected=classOf[IndexOutOfBoundsException], timeout=300)
  def testWithBothParameters {
    new ArrayList().get(1)
  }
}