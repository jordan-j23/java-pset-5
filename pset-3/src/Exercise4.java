import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Height : ");
        double mmheight = input.nextDouble();

        System.out.print("Width : ");
        double mmwidth = input.nextDouble();

        mmheight = mmheight * 2.54;
        mmwidth = mmwidth * 2.54;
        double Rectperimeter = mmheight * mmwidth;

        System.out.printf("\n %,.2f", Rectperimeter);
        System.out.println(" square millimeters.");
    }
}