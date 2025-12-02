import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] numbers = new int[5]; // default values are 0

        // Display original array
        display("Original array:", numbers);

        // Fill array with 8s
        Arrays.fill(numbers, 8);
        display("After filling with 8s:", numbers);

        // Change two elements
        numbers[1] = 6; 
        numbers[3] = 3;
        display("After changing two values:", numbers);

        // Sort array
        Arrays.sort(numbers);
        display("After sorting:", numbers);
    }

    // Method to display a message + array contents
    public static void display(String message, int array[]) {
        System.out.print(message + "\t");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
