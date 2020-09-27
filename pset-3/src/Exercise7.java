import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Salary  : ");
        double sal = in.nextDouble();
        double check = sal/24;

        System.out.print("401(k)  : ");
        double pretax = in.nextDouble();

        System.out.print("Federal : ");
        double fed = in.nextDouble();

        System.out.print("State   : ");
        double state = in.nextDouble();

        double tax1 = check*(1-(pretax*.01));
        double tax2 = tax1*(fed*.01);
        double tax3 = tax1*(state*.01);
        double sum = tax1-(tax2+tax3);
        String TotalPay = String.format("%,.2f", sum);

        System.out.println("\n"+"$" + TotalPay + ".");


    }
}