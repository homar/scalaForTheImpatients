package pl.homar.scala.impatients.chapter14

sealed abstract class BinaryTreeUpdated 
case class LeafUpdated( value: Int) extends BinaryTreeUpdated 
case class NodeUpdated( rest: BinaryTreeUpdated*) extends BinaryTreeUpdated

object BinaryTreeUpdated{
  def binaryTreeLeafSum(tree: BinaryTreeUpdated):Int = {
    tree match  {
      case LeafUpdated(value) => value
      case NodeUpdated(nodes @ _*) => nodes.map(binaryTreeLeafSum _).sum
    }
  }
}
