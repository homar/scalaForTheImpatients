package pl.homar.scala.impatients.chapter8

  class Manuscript(
      val wordCount: Long,
      val year: Int,
      var condition: String)
  class BoundText(
      wordCount: Long,
      val pageCount: Int,
      year: Int,
      condition: String) extends Manuscript(wordCount, year, condition) {
    def avgWordsPerPage = wordCount / pageCount
  }
  class Book(
      wordCount: Long,
      pageCount: Int,
      val blankPageCount: Int,
      year: Int,
      condition: String) extends BoundText(wordCount, pageCount, year,condition) {
    override def avgWordsPerPage = wordCount / (pageCount - blankPageCount)
  }
  class Magazine(
      wordCount: Long,
      pageCount: Int,
      year: Int,
      condition: String) extends BoundText(wordCount, pageCount, year,condition)
  class Poster(
      wordCount: Long,
      year: Int,
      condition: String,
      val xDim: Float,
      val yDim: Float) extends Manuscript(wordCount, year,condition) {
    val area = xDim * yDim
  }