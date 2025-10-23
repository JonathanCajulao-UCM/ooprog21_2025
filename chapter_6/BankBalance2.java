import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 103.8; // starting balance
        final double INTEREST_RATE = 0.03;
        int year = 2;
        int choice;

        do {
            year++;
            balance = balance + (balance * INTEREST_RATE);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n",
                    year, INTEREST_RATE, balance);

            System.out.print("\nDo you want to see the balance at the end of another year?\n"
                    + "Enter 1 for yes\n"
                    + "or any other number for no >> ");
            choice = input.nextInt();
        } while (choice == 1);
    }
}
