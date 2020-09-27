import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Students : ");
        double students = input.nextDouble();

        System.out.print("Teachers : ");
        double teachers = input.nextDouble();

        double passengers = students + teachers;

        System.out.print("Capacity : ");
        double cap = input.nextDouble();

        double buses = (passengers/cap)+.5;
        String busesNeeded = String.format("%,.0f", buses);
        System.out.println("\n" + "Buses required      : " + busesNeeded);

        double excess = passengers % cap;
        String overflow = String.format("%,.0f", excess);
        System.out.println("Overflow passengers : " + overflow);
    }
}