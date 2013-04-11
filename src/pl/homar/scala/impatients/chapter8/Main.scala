package pl.homar.scala.impatients.chapter8

object Main extends App {
  val banAccount = new BankAccount(10.0)
  val checkingAccount = new CheckingAccount(10.0);

  banAccount.deposit(10.0)
  println(banAccount.withdraw(5.0))
  checkingAccount.deposit(10.0)
  println(checkingAccount.withdraw(5.0))

  val savingAccount = new SavingsAccount(10.0)
  savingAccount.deposit(10.0)
  savingAccount.deposit(10.0)
  savingAccount.withdraw(5.0)
  savingAccount.withdraw(5.0)
  println(savingAccount.earnMonthlyInterest)

  val bundle = new Bundle

  val SimpleItem1 = new SimpleItem(1.0, "test")
  val SimpleItem2 = new SimpleItem(2.0, "test")

  bundle.items += SimpleItem1
  bundle.items += SimpleItem2
  println(bundle.price)
  println(bundle.description)
}