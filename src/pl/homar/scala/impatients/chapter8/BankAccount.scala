package pl.homar.scala.impatients.chapter8

class BankAccount(initialBalance: Double) {
	private var balance = initialBalance
	
	def deposit(amount: Double) = {
	  balance += amount
	  balance
	}
	
	def withdraw(amount: Double) = {
	  balance -= amount
	  balance
	}
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance){
  
  override def deposit(amout: Double)= {
    super.deposit(amout - 1.0)
  }
  
  override def withdraw(amout: Double)= {
    super.withdraw(amout + 1.0)
  }
}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance){
  private var transactionCount = 0
  
  def earnMonthlyInterest() = {
    val currentBalance = super.deposit(0.0)
    transactionCount = 0;
    super.deposit(0.1 * currentBalance)
  }
  
  override def deposit(amount: Double) = {
    transactionCount += 1;
    if(transactionCount > 3){
      super.deposit(amount - 1.0)
    }
    else{
    	super.deposit(amount)
    }
  }
  
  override def withdraw(amount: Double) = {
    transactionCount += 1;
    if(transactionCount > 3){
      super.withdraw(amount + 1.0)
    }else{
      super.withdraw(amount)
    }
  }
  
  
}