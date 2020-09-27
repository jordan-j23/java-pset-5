import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Homework 1 : ");
        double hw1 = input.nextDouble();
        System.out.print("Homework 2 : ");
        double hw2 = input.nextDouble();
        System.out.print("Homework 3 : ");
        double hw3 = input.nextDouble();
        double worktotal1 = hw1*.15+hw2*.15+hw3*.15;
        double avg1 = worktotal1/3;

        System.out.print("Quiz 1     : ");
        double quiz1 = input.nextDouble();
        System.out.print("Quiz 2     : ");
        double quiz2 = input.nextDouble();
        double worktotal2 = quiz1*.35+quiz2*.35;
        double avg2 = worktotal2/2;


        System.out.print("Test 1     : ");
        double test = input.nextDouble();
        double avg3 = test*.5;

        double avgFinal = avg1+avg2+avg3;
        String output = String.format("%.2f", avgFinal);
        System.out.println("\n" + output + "%.");
    }
}