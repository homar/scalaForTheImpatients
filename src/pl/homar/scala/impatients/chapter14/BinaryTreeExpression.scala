package pl.homar.scala.impatients.chapter14

sealed abstract class BinaryTreeExpression 
case class LeafExpression( value: Int) extends BinaryTreeExpression 
case class NodeExpression(op:Char, rest: BinaryTreeExpression*) extends BinaryTreeExpression

object BinaryTreeExpression {
  def eval(tree: BinaryTreeExpression):Int = {
    tree match{
      case LeafExpression(value) => value
      case NodeExpression(op, rest @ _*) => op match {
        case '+' => rest.map(eval _).sum
        case '-' => -rest.map(eval _).sum
        case '*' => rest.map(eval _).product
      }
    }
  }
}