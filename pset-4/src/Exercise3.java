import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length        : ");
        int l = input.nextInt();
        System.out.print("Width         : ");
        int w = input.nextInt();
        System.out.print("Diameter      : ");
        int dm = input.nextInt();
        int area = l * w;

        double circleArea = Math.PI * (Math.pow(0.5 * dm, 2));
        double sumArea = area - circleArea;

        System.out.printf("\nSurface Area  : %,.2f%n", sumArea);
        input.close();
    }
}