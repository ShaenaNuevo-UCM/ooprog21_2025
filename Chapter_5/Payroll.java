import java.util.Scanner;
public class Payroll
{
   public static void main(String[] args) 
   {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter employee number (max 9999): ");
      int empNumber = scanner.nextInt();
      
      System.out.print("Enter hours worked this week: ");
      int hoursWorked = scanner.nextInt();
      
      System.out.print("Enter pay rate (max 60.00): ");
      double payRate = scanner.nextDouble();

      Employee employee = new Employee(empNumber, hoursWorked, payRate);
      
      double regularPay = employee.calculateRegularPay();
      double overtimePay = employee.calculateOverTimePay();
      
      System.out.println("How many hours did you work this week? " + hoursWorked);
      System.out.println("What is your regular pay rate? " + payRate);
      System.out.println("Regular pay is " + regularPay);
      System.out.println("Overtime pay is " + overtimePay);
      
      scanner.close();
   }
}