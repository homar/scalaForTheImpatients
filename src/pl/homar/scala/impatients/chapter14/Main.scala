package pl.homar.scala.impatients.chapter14

object Main extends App {
	def swapPair(p: (Int, Int)) = {
	  p match {
	    case (x: Int, y:Int) => (y,x)
	    case _ => p
	  }
	}
	
	val pair = (1,2)
	println(swapPair(pair))
	
	def swapArray(a: Array[Any]) = {
	  a match{
	    case Array(x,y) => Array(y,x)
	    case Array(x, y, rest @ _*) => Array(y,x) ++ rest
	    case _ => a
	  }	
	}
	
	println(swapArray(Array('a')).mkString(","))
	println(swapArray(Array('a','b')).mkString(","))
	println(swapArray(Array('a','b','c')).mkString(","))
	    
	val bundle = Bundle("Father's day special", 20.0, 
		Multiple(1, Article("Scala for the Impatient", 39.95)), 
		Bundle("Anchor Distillery Sampler", 10.0, 
			Article("Old Potrero Straight Rye Whiskey", 79.95), 
			Article("Junípero Gin", 32.95)
		)
	)
	
	println(pl.homar.scala.impatients.chapter14.Item.price(bundle))
	
	def leafSum(list: List[Any]): Int = {
	  list match {
	    case Nil => 0
	    case h::tail => h match{
	      case i: Int => i + leafSum(tail)
	      case l: List[Any] => leafSum(l) + leafSum(tail)
	    }
	  }
	}
	
	val myList = List(List(3, 8), 2, List(5))
	println(leafSum(myList))
	
	val binaryTree = Node(Node(Leaf(3), Leaf(8)), Leaf(5))
	println(BinaryTree.binaryTreeLeafSum(binaryTree))
	
	val binaryTreeUpdated = NodeUpdated(NodeUpdated(LeafUpdated(3), LeafUpdated(8)), LeafUpdated(2), NodeUpdated(LeafUpdated(5)))
	println(BinaryTreeUpdated.binaryTreeLeafSum(binaryTreeUpdated))
	
	val binaryTreeExpression = NodeExpression('+', NodeExpression('*', LeafExpression(3), LeafExpression(8)), LeafExpression(2),  NodeExpression('-', LeafExpression(5)))
	println(BinaryTreeExpression.eval(binaryTreeExpression))
	
	def sumListOfOption(list: List[Option[Int]]) = {
	  list.map(_.getOrElse(0)).sum
	}
	
	val listOfOptions = List(Some(1), None, Some(2), None, Some(3))
	println(sumListOfOption(listOfOptions))
	
	type T = Double => Option[Double]
	
	def compose(f:T, g:T) = {
	  (x:Double) => f(x) match {
	    case Some(x) => g(x)
	    case None => None
	  }
	}
	
	def f(x: Double) = if (x >= 0) Some(Math.sqrt(x)) else None 
	def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None 
	
	println(compose(f,g)(4))
	
}