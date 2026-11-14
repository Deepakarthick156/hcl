import java.util.Scanner;
interface Payment{
    double calculateFee(double amount);
}
class CreditCardPayment implements Payment{
    double fee=2/100;
    public double calculateFee(double amount){
        return (amount*fee);
    }
}
class UpiPayment implements Payment{
    double fee=0.5/100;
    public double calculateFee(double amount){
        return (amount*fee);
    }
}
class WalletPayment implements Payment{
    double fee=1/100;
    public double calculateFee(double amount){
        return (amount*fee);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int category=scan.nextInt();
        double amount=scan.nextDouble();
        if(category==1){
            CreditCardPayment cc=new CreditCardPayment();
            cc.calculateFee(amount);
            System.out.println("Payment Amount:"+amount);
            System.out.println("Transcation fee:"+cc.calculateFee(amount));
            System.out.println("Final Amount:"+(cc.fee+amount));
        }
        else if(category==2){
            UpiPayment up=new UpiPayment();
            up.calculateFee(amount);
            System.out.println("Payment Amount:"+amount);
            System.out.println("Transcation fee:"+up.calculateFee(amount));
            System.out.println("Final Amount:"+(up.fee+amount));
        }
        else{
            WalletPayment wp=new WalletPayment();
            wp.calculateFee(amount);
            System.out.println("Payment Amount:"+amount);
            System.out.println("Transcation fee:"+wp.calculateFee(amount));
            System.out.println("Final Amount:"+(wp.fee+amount));
        }
        
    }
}
