import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 103.8;
        final double INTEREST_RATE = 0.03; 
        int year = 2;
        int choice;

        System.out.print("Do you want to see next year's balance?\nEnter 1 for yes or any other number for no >> ");
        choice = input.nextInt();
        
        
        do{
         balance = balance + (balance * INTEREST_RATE);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n", year, INTEREST_RATE, balance);
            year++;

            System.out.print("\nDo you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no >> ");
            choice = input.nextInt();

        }
        while (choice == 1);    
        
    }
}
