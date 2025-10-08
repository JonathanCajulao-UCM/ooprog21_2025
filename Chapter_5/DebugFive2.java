// DebugFive2.java
// Decides if two numbers are evenly divisible
import java.util.Scanner;
public class DebugFive2
{
public static void main(String args[])
{
int num;
int num2;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number ");
num = scanner.nextInt();
System.out.print("Enter another number ");
num2 = scanner.nextInt();
if((num % num2 == 0) && (num2 / num) == 0)
{
System.out.println("One of these numbers is");
System.out.println(" evenly divisible into the other");
}
else
{ System.out.println("Neither of these numbers is");
System.out.println(" evenly divisible into the other");
}
}
}