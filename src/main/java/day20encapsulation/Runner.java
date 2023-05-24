package day20encapsulation;

public class Runner {
    public static void main (String[] args) {

        BankAccount acc = new BankAccount(26, "Bedr", 1000);
        System.out.println(acc.getOwnerName());
        System.out.println(acc.getAccNo());
        System.out.println(acc.getBalance());


    }
}
