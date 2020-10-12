import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = in.nextInt();

        if (number > 0) {
            System.out.println(" ");
            System.out.println("Positive.");
        } else if (number == 0) {
            System.out.println(" ");
            System.out.println("Zero.");
        } else {
            System.out.println(" ");
            System.out.println("Negative.");
        }

        in.close();
    }
}
