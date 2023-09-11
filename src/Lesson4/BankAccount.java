package Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Darya";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "Boch";
        YourAccount.balance = 67.8;

        HisAccount.id = 3;
        HisAccount.name = "Zhir";
        HisAccount.balance = 8888.9;

        System.out.println(MyAccount.id);
        System.out.println(YourAccount.name);
        System.out.println(HisAccount.balance);
    }
}
