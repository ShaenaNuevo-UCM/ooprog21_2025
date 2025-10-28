import java.util.Scanner;

public class BankBalanceFL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        double interestRate;
        int year;

        System.out.print("Enter initial bank balance >> ");
        balance = input.nextDouble();

        for (interestRate = 0.02; interestRate <= 0.05; interestRate += 0.01) {
            System.out.printf("%nWith an initial balance of $%.1f at an interest rate of %.2f%n",
                              balance, interestRate);

            double newBalance = balance;

            for (year = 1; year <= 4; year++) {
                newBalance = newBalance + (newBalance * interestRate);
                System.out.printf("After year %d balance is %.4f%n", year, newBalance);
            }
        }

        input.close();
    }
}
