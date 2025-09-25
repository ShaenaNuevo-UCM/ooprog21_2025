import javax.swing.JOptionPane;
public class DemoGrossPay 
{
   public static double calculateGross(double hours)  
   {
      final double HOURLY_RATE = 22.75;
      return hours * HOURLY_RATE;      
   }
   
   public static void main(String[] args)
   {
      String input = JOptionPane.showInputDialog("Enter hours worked for employee: " );
      double hours = Double.parseDouble(input);
      double gross = calculateGross(hours);
      JOptionPane.showMessageDialog(null,
      hours + " hours at $22.75 per hour is $" + gross);
    }
}