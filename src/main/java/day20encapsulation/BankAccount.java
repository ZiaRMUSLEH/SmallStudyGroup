package day20encapsulation;

public class BankAccount {
    /*
    create a bank account class with 3 attributes acc no, balance, and owner name.
    class should be read only
    also create public methods deposit and withdraw to update the account balance,
    implement the class to show controlled access through encapsulation,
     */

    private int accNo;
    private String ownerName;
    private double balance;

    public int getAccNo () {
        return accNo;
    }

    public String getOwnerName () {
        return ownerName;
    }

    public double getBalance () {
        return balance;
    }

    public BankAccount (int accNo, String ownerName, double balance) {
        this.accNo = accNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance = balance+amount;
    }
    public double withdraw(double amount){
        if(balance>amount){
        balance = balance-amount;
    }else {
            System.out.println("Insufficient balance!");
        } return balance;
    }
}
