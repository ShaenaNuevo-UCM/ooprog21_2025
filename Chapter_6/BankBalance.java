import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        double interestRate = 0.03; 
        int year = 0;
        int choice;

        System.out.print("Enter initial bank balance >> ");
        balance = input.nextDouble();

        System.out.print("Do you want to see next year's balance? ");
        System.out.print("\nEnter 1 for yes or any other number for no >> ");
        choice = input.nextInt();

        while (choice == 1) {
            year++;
            balance = balance + (balance * interestRate);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n", year, interestRate, balance);

            System.out.print("\nDo you want to see the balance at the end of another year? ");
            System.out.print("\nEnter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
        }
        input.close();
    }
}

