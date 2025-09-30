import java.util.Scanner;

// Main class
public class DebugFour3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int w, l, h;

        System.out.print("Enter width of box >> ");
        w = input.nextInt();
        System.out.print("Enter length of box >> ");
        l = input.nextInt();
        System.out.print("Enter height of box >> ");
        h = input.nextInt();

        // Create boxes
        DebugBox box1 = new DebugBox();            // default constructor
        DebugBox box2 = new DebugBox(w, l, h);     // parameterized constructor

        // First box
        System.out.println("The dimensions of the first box are");
        box1.showData();
        System.out.print("The volume of the first box is ");
        showVolume(box1);

        // Second box
        System.out.println("The dimensions of the second box are");
        box2.showData();
        System.out.print("The volume of the second box is ");
        showVolume(box2);
    }

    // Static method to display volume
    public static void showVolume(DebugBox aBox) {
        double vol = aBox.getVolume();
        System.out.println(vol);
    }
}
