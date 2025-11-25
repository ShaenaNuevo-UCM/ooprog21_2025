import java.util.Scanner;

public class CompareStrings 
{
   public static void main(String[] args) 
   {
      Scanner s = new Scanner(System.in);
      String name;

      System.out.print("Enter your name > ");
      name = s.nextLine();

      String predefined = "Carmen";

      if(name.equals(predefined))
      {
         System.out.println(name + " equals " + predefined);
      }
      else
      {
         System.out.println(name + " does not equal " + predefined);
      }

      s.close();
   }
}
