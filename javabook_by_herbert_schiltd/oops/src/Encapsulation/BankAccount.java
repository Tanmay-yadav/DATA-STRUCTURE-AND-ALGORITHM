package Encapsulation;

public class BankAccount {
    private long accountnumber;
    private double balance;

    public long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;  this here is the setter of the balance
//                                 which is not needed here because the amount is set through deposit only
//    }

    public void deposit(int value){
        if(value<0){
            System.out.println("invalid amount ");

        }else{
            this.balance=value;
        }
    }
    public int withdraw(int value){
        if (value<=0){
            System.out.println("invalid input");
        }
        else if(value>balance){
            System.out.println("Insuficient amount in the account");

        }
        this.balance = balance-value;
        return value;
    }
}
