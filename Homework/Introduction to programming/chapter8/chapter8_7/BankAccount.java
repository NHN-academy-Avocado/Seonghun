package chapter8_7;

public class BankAccount {
  private String name, surname;
  private double balance;

  public double getBalance() {
    return balance;
  }

  public BankAccount(String n, String s) {
    name = n;
    surname = s;
    balance = 0;
  }

  public void rateBalance(double d) {
    balance += (balance * d);
  }

  public void deposit(double val) {
    balance = balance + val;
  }

  public String toString() {
    return "{ Owner: " + name + " " + surname +
        " - Balance: Euro " + balance + " }";
  }

  public void withdraw(double val) {
    if (val <= balance)
      balance -= val;
    else
      System.out.println("Not sufficient money for withdrawal");
  }

  public boolean sameOwner(BankAccount ba) {
    return this.name.equals(ba.name) &&
        this.surname.equals(ba.surname);
  }

  public void transferTo(BankAccount ba, double val) {
    if (val <= this.balance) {
      this.withdraw(val);
      ba.deposit(val);
    } else
      System.out.println("It is not possible to withdraw " + val +
          " Euro from account " + this);
  }

  public void transferFrom(BankAccount ba, double val) {
    if (val <= ba.balance) {
      ba.withdraw(val);
      this.deposit(val);
    } else
      System.out.println("It is not possible to withdraw " + val +
          " Euro from account " + ba);
  }
}
