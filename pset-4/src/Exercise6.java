import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%-10s: ","Length");
        double l = input.nextDouble();
        System.out.printf("%-10s: ","Width");
        double w = input.nextDouble();

        double area = l * w;
        double pm = (l * 2) + (w * 2);
        double dg = Math.sqrt(Math.pow(l, 2) + Math.pow(w, 2));

        System.out.printf("\n%-10s: %,.2f", "Area", area);
        System.out.printf("\n%-10s: %,.2f", "Perimeter", pm);
        System.out.printf("\n%-10s: %,.2f", "Diagonal", dg);
    }
}