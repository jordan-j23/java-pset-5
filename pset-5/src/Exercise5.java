import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        double letterInput = input.nextDouble();

        if(letterInput > 100){
            System.out.println("\nGrades above 100 are invalid.");
        } 
        else if(letterInout <= 100 && letter >= 90) {
            System.out.println("\nYou received an A.");
        } 
        else if (letterInput < 90 && letter >= 80) {
            System.out.println("\nYou received a B.");
        } 
        else if (letterInput < 80 && letter >= 70){
            System.out.println("\nYou received a C.");
        } 
        else if (letterInput < 70 && letter >= 60){
            System.out.println("\nYou received a D.");
        }
        else if (letterInput < 60 && letter >= 0){
            System.out.println("\nYou received an F.");
        } 
        else if (letterInput < 0) {
            System.out.println("\nGrades below 0 are invalid.");
        }
        input.close();
    }
}
