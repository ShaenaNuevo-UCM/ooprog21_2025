// Start with a penny
// double it every day
// how much do you have in x number of days?
import java.util.Scanner;
public class DebugSix1
{
   public static void main(String args[])
   {
      Scanner keyboard = new Scanner(System.in);
      int days;
      double money = 0.01;
      double total_Money = 0;
      int day = 1;
      System.out.print("Enter number of days >> ");
      days = keyboard.nextInt();
      while(day <= days) 
      {
         total_Money = money;
         money = money * 2; 
         ++day;
      }
      System.out.println("After day " + days +
            " you have " + total_Money);
   }
}
