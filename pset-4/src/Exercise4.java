import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Centimeters : ");
        int cm = in.nextInt();

        int km = cm/100000;
        cm = cm % 100000;
        int m = cm / 100;
        cm = cm % 100;


        System.out.println("\nKilometers  : " + km);
        System.out.println("Meters      : " + m);
        System.out.println("Centimeters : " + cm);
        in.close();
    }
}