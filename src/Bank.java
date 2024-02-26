import java.util.Scanner;

public class Bank extends MyPhone {
    private double balance;
    private String name;
    private double depositAmount;
    private double withdrawAmount;
    public Bank(){

    }

    public Bank(String name,double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    public void checkBalance(){
        System.out.println("Ваш баланс "+balance);
    }
    public void withdraw(int money){
        if (balance >= money){
            balance-=money;
        }else {
            System.err.println(" Недостаточно средств ");
        }
    }
    public  void deposit(int money){
        balance+=money;
    }
    public void translation(double money){
        if (balance>money){
            balance-=money;
            System.out.println(" success "+money);
        }else {
            System.err.println("summa nedostatochno");
        }
    }

}




