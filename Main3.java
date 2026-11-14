import java.util.Scanner;
class Vehicle{
    double dailyRate;
    Vehicle(double dailyRate){
        this.dailyRate=dailyRate;
    }
    public double calculateRentalCharge(int rentalDays){
        return dailyRate*rentalDays;
    }
    public String getVehicleType(){
        return "Vehicle";
    }

}
class Car extends Vehicle{
    Car(){
        super(1500.0);
    }
    public String getVehicleType(){
        return "Car";
    }
    
}
class Bike extends Vehicle{
    Bike(){
    super(600.0);
    }
    public String getVehicleType(){
        return "Bike";
    }
}
class Truck extends Vehicle{
    Truck(){
    super(3000.0);
    }
    public String getVehicleType(){
        return "Truck";
    }
}
public class Main3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Vehicle v;
        int category=scan.nextInt();
        int rentalDays=scan.nextInt();
        if(category==1){
            v=new Car();
        }
        else if(category==2){
            v=new Bike();
        }
        else v=new Truck();
        System.out.println("Vehicle Type"+v.getVehicleType());
        System.out.printf("%.2f",v.calculateRentalCharge(rentalDays));
    }
}
