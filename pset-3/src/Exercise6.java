import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wage      : ");
        double wage = input.nextDouble();

        System.out.print("Monday    : ");
        double mon = input.nextDouble();
        System.out.print("Tuesday   : ");
        double tue = input.nextDouble();
        System.out.print("Wednesday : ");
        double wed = input.nextDouble();
        System.out.print("Thursday  : ");
        double thu = input.nextDouble();
        System.out.print("Friday    : ");
        double fri = input.nextDouble();
        System.out.print("Saturday  : ");
        double sat = input.nextDouble();
        System.out.print("Sunday    : ");
        double sun = input.nextDouble();

        double sum= (mon*wage)+(tue*wage)+wed*wage+thu*wage+fri*wage+sat*wage+
                sun*wage;
        String wagePerWeek = String.format("%.2f", sum);
        System.out.println("\n" + "$" + wagePerWeek + ".");
    }
}