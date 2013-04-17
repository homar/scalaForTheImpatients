package pl.homar.scala.impatients.chapter14

sealed abstract class BinaryTree 
case class Leaf( value: Int) extends BinaryTree 
case class Node( left: BinaryTree, right: BinaryTree) extends BinaryTree

object BinaryTree{
  def binaryTreeLeafSum(tree: BinaryTree):Int = {
    tree match {
      case Leaf(value) => value
      case Node(left, right) => binaryTreeLeafSum(left) + binaryTreeLeafSum(right)
    }
  }
}
