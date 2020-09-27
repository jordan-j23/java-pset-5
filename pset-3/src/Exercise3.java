import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Height : ");
        double mmheight = input.nextDouble();

        System.out.print("Width : ");
        double mmwidth = input.nextDouble();

        mmheight = mmheight * 25.4;
        mmwidth = mmwidth * 25.4;
        double RectArea = mmheight * mmwidth;

        System.out.printf("\n %,.2f", RectArea);
        System.out.println(" square millimeters.");
    }
}