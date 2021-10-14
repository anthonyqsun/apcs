public class BankAccount {
  private static String name;
  private static String password;
  private static int pin;
  private static int accountNumber;
  private static double balance;

  // sets given account name as bank account name
  public static void setName(String userName) {
    name = userName;
  }

  // sets given account password as bank account password
  public static void setPassword(String userPass) {
    password = userPass;
  }

  // sets given account pin as bank account pin
  public static void setPin(int pinNum) {
    pin = pinNum;
  }

  // sets given account number as bank account number
  public static void setAccNum(int accNum) {
    accountNumber = accNum;
  }

  // only displays public-facing information
  public static void displayAccountInfo() {
    System.out.println(name);
    System.out.println(accountNumber);
    System.out.println(balance);
  }

  // deposits money into bank account if pin is correct
  public static void deposit(double amount, int userPin) {
    if (pin == userPin) {
      balance += amount;
      System.out.println("Your new balance is " + balance);
    }
    else {
      System.out.println("Invalid pin #");
    }
  }

  // deposits money into bank account if password is correct
  public static void deposit(double amount, String userPass) {
    if (password == userPass) {
      balance += amount;
      System.out.println("Your new balance is " + balance);
    }
    else {
      System.out.println("Invalid password");
    }
  }

  // withdraws money from bank account if pin is correct
  public static void withdraw(double amount, int userPin) {
    if (pin == userPin) {
      if (balance-amount <0) {
        System.out.println("You cannot withdraw more than " + balance+". You will be in debt and we will be angry at you.");
      }
      else {
        balance -= amount;
        System.out.println("Your new balance is " + balance);

      }
    }
    else {
      System.out.println("Invalid pin #");
    }
  }

  // withdraws money from bank account if password is correct
  public static void withdraw(double amount, String userPass) {
    if (password == userPass) {
      if (balance-amount <0) {
        System.out.println("You cannot withdraw more than " + balance+". You will be in debt and we will be angry at you.");
      }
      else {
        balance -= amount;
        System.out.println("Your new balance is " + balance);

      }
    }
    else {
      System.out.println("Invalid password");
    }
  }

  public static void main(String[] args) {

    name = "Insecure Geese";
    password = "abc123qwerty!";
    pin = 1234;
    accountNumber = 100000001;
    balance = 10.0;

    displayAccountInfo();

    System.out.println("Depositing:");
    deposit(500,1234);
    deposit(200, "abc123qwerty!");

    System.out.println("Deposit attempt with wrong password:");
    deposit(100000,"uwusenpai");

    System.out.println("Withdrawing:");
    withdraw(5, 1234);
    withdraw(4, "abc123qwerty!");

    System.out.println("Withdraw attempt with wrong password");
    withdraw(5, "qwertyuiop");
  }
}
