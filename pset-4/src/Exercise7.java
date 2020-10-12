import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Side : ");
        double s = input.nextDouble();

        double area = ((3 * Math.sqrt(3)) * (Math.pow(s, 2))) / 2;
        double pm = (s * 6);

        System.out.print("\nArea      : ");
        System.out.printf("%,.2f", area);
        System.out.print("\nPerimeter : ");
        System.out.printf("%,.2f", pm);
        input.close();
    }
}