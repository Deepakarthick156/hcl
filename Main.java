import java.util.Scanner;

abstract class Employee{
    private int employeeId;
    private String employeeName;
    Employee(int employeeId,String employeeName){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    abstract double calculateSalary();
}
class FullTimeEmployee extends Employee{
        double monthlySalary;
        FullTimeEmployee(int employeeId,String employeeName,double monthlySalary){
            super(employeeId,employeeName);
            this.monthlySalary=monthlySalary;
        }
        public double calculateSalary(){
            return monthlySalary;
        }
}
class ContractEmployee extends Employee{
    int workingDays;
    double dailyRate;
    ContractEmployee(int employeeId,String employeeName,int workingDays,double dailyRate){
        super(employeeId,employeeName);
        this.workingDays=workingDays;
        this.dailyRate=dailyRate;
    }
    public double calculateSalary(){
        return workingDays*dailyRate;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int category=scan.nextInt();
        int employeeId=scan.nextInt();
        String employeeName=scan.next();
        Employee emp;
        if(category==1){
            int monthlySalary=scan.nextInt();
            emp=new FullTimeEmployee(employeeId, employeeName, monthlySalary);
        }
        else{
            int workingDays=scan.nextInt();
            double dailyRate=scan.nextDouble();
            emp=new ContractEmployee(employeeId, employeeName, workingDays, dailyRate);
        }
        System.out.println("Employee Id:"+emp.getEmployeeId());
        System.out.println("Employee name:"+emp.getEmployeeName());
        System.out.printf("%.2f",emp.calculateSalary());
    }
}