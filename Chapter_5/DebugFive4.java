// DebugFive4.java
// Outputs highest of four numbers
import java.util.Scanner;
public class DebugFive4
{
   public static void main (String args[]) 
   {
      int one, two, three, four;
      int highest;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      one = input.nextInt();
      System.out.print("Enter an integer >> ");
      two = input.nextInt();
      System.out.print("Enter an integer >> ");
      three = input.nextInt();
      System.out.print("Enter an integer >> ");
      highest = input.nextInt();
      if(one > two && one > three && one > highest)
         highest = one;
      else
         if(two > one && two > three && two > highest)
            highest = two;
         else
           if(three > one && three > two && three > highest)
              highest = three;
           else
              highest = highest;
      System.out.println("The highest number is " + highest);
   }
}


