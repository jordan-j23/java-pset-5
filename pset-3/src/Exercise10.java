import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Fahrenheit : ");
        double frnht = input.nextDouble();

        double cel = ((frnht-32)/1.8000);
        String cel_ = String.format("%,.2f", cel);
        System.out.println("\n"+"Celsius : " + cel_);

        double kel = (((frnht-32)/1.8000)+273.15);
        String kel_ = String.format("%,.2f", kel);
        System.out.println("Kelvin  : " + kel_);
    }
}