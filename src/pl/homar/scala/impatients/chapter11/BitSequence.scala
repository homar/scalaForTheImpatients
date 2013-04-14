package pl.homar.scala.impatients.chapter11

class BitSequence(private var value: Long = 0) {

	def update(bit: Int, state: Int) = value |= (state & 1L) << bit % 64
	def apply(bit: Int): Int = if ((value & 1L << bit % 64) > 0) 1 else 0

	override def toString = "%64s".format(value.toBinaryString).replace(" ", "0")
}