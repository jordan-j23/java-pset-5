import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Amount : ");
        double total = input.nextDouble();

        int quart = (int)(total/.25);
        total = total %.25;

        int dimes = (int)(total/.1);
        total = total %.1;

        int nick =(int)(total/.05);
        total = total %.05;

        int penn = (int)(total/.01);

        System.out.println("\n"+"Quarters : " + quart);
        System.out.println("Dimes    : " + dimes);
        System.out.println("Nickels  : " + nick);
        System.out.println("Pennies  : " + penn);

    }
}