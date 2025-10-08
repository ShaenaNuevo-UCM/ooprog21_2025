class Employee
{
   int employeeNum;
   int hoursWorked;
   double payRate;
   final int MAX_EMPLOYEE_NUMBER = 9999;
   final double MAX_RATE = 60.00;
   final double OVER_TIME_RATE = 1.5;
   
   public Employee (int employeeNum, int hoursWorked, double payRate) 
   {
      this.employeeNum = employeeNum;
      this.hoursWorked = hoursWorked;
      this.payRate = payRate;
   } 
   
   public double calculateRegularPay()
   {
      if (hoursWorked <= 40) {
       return hoursWorked * payRate;
       } else {
          return 40 * payRate;
       }
   }
   
   public double calculateOverTimePay() 
   {
      if (hoursWorked > 40) 
      {
      double overtimeHours = hoursWorked - 40;
      return overtimeHours * payRate * OVER_TIME_RATE;
      } else {
      return 0;
      }
   }
}