 import java.util.Scanner;

// Class that represents the user's piggy bank (aka Bank Account)
class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
 balance = initialBalance;
 }

 // Add money to the piggy bank
 public void deposit(double amount) {
 if (amount <= 0) {
 System.out.println("Nice try, but you can't deposit negative money.");
 return;
 }
 balance += amount;
 System.out.println("Money magic! Deposited: INR" + amount);
 }

 // Take money out if you have it
 public void withdraw(double amount) {
 if (amount <= 0) {
 System.out.println("You trying to withdraw ghost money?");
 return;
 }
 if (amount > balance) {
 System.out.println("Oops! Not enough money");
 } else {
 balance -= amount;
 System.out.println("Here you go! Withdrawn: INR " + amount);
 }
 }

 // Check your balance
 public void checkBalance() {
 System.out.println("Your current balance is: INR " + balance);
 }
}

// Class that represents the magical ATM
class ATM {
 private final BankAccount account;

 public ATM(BankAccount account) {
 this.account = account;
 }

 // Start the ATM interface
 public void start() {
 Scanner scanner = new Scanner(System.in);
 int choice;

 do {
 System.out.println("Welcome to SimpleATM");
 System.out.println("1. Withdraw");
 System.out.println("2. Deposit");
 System.out.println("3. Check Balance");
 System.out.println("4. Exit");
 System.out.print("Choose wisely (1-4): ");
 choice = scanner.nextInt();

 switch (choice) {
 case 1:
 System.out.print("Enter amount to withdraw: INR ");
 double withdrawAmount = scanner.nextDouble();
 account.withdraw(withdrawAmount);
 break;
 case 2:
 System.out.print("Enter amount to deposit: INR ");
 double depositAmount = scanner.nextDouble();
 account.deposit(depositAmount);
 break;
 case 3:
 account.checkBalance();
 break;
 case 4:
 System.out.println("Thanks for using our totally safe ATM, Please visit again!");
 break;
 default:
 System.out.println("You had made a wrong choice. Please choose correctly, champ.");
 }
 } while (choice != 4);

 scanner.close();
 }
}

public class SimpleATM {
 public static void main(String[] args) {
 // Start with INR 100000 so you feel a bit rich
 BankAccount myAccount = new BankAccount(100000.0);
 ATM myATM = new ATM(myAccount);
 myATM.start();
 }
}
