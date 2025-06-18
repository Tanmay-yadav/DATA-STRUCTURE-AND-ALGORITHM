package Encapsulation;

public class Test2  {
    public static void main(String[] args) {
    BankAccount ba =new BankAccount();
ba.setAccountnumber(1232143553);
        System.out.println(ba.getAccountnumber());
ba.deposit(-11);
        System.out.println(ba.getBalance());
ba.deposit(100);
ba.withdraw(10);
double balance =ba.getBalance();
        System.out.println(balance);
    }

}
