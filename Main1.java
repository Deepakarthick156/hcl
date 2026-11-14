import java.util.Scanner;
class BankAccount{
    int accountNumber;
    double balance;
    BankAccount(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public double calculateFinalBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(int accountNumber,double balance,double interestRate){
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }
    public double calculateFinalBalance(){
        return balance+(balance*interestRate/100);
    }
}
class CurrentAccount extends BankAccount{
    double overdraftLimit;
    CurrentAccount(int accountNumber,double balance,double overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit=overdraftLimit;
    }
    public double calculateFinalBalance(){
        return balance+overdraftLimit;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int category=scan.nextInt();
        BankAccount bk;
        int accountNumber=scan.nextInt();
        double balance=scan.nextDouble();
        if(category==1){
            double interestRate=scan.nextDouble();
            bk=new SavingsAccount(accountNumber, balance, interestRate);
        }
        else{
            double overdraftLimit=scan.nextDouble();
            bk=new CurrentAccount(accountNumber, balance, overdraftLimit);
        }
        System.out.printf("%.2f",bk.calculateFinalBalance());
    }
}
