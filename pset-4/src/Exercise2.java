import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inches : ");
        double inches = input.nextDouble();
        int in = (int) inches;

        int mi = in / 63360;
        int newMi = in % 63360;
        int ft = newMi / 12;
        int newFt = newMi % 12;


        System.out.println("\nMiles  : " + mi);
        System.out.println("Feet   : " + ft);
        System.out.println("Inches : " + newFt);
        input.close();
    }
}