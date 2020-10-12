import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
       System.out.printf("Enter three integers.%n%n");
        System.out.print("Enter integer: ");
       
       int numOne = input.nextInt();
        System.out.print("Enter integer: ");
       
       int numTwo = input.nextInt();
        System.out.print("Enter integer: ");
      
      int numThree = input.nextInt();
        if (numOne == numTwo && numTwo == numThree) {
            System.out.printf("%nSame.");
        } 
        else if (numOne < numTwo && numTwo < numThree) {
            System.out.printf("%nStrictly increasing.");
        } 
        else if (numOne <= numTwo && numTwo <= numThree) {
            System.out.printf("%nIncreasing.");
        } 
        else if (numOne > numTwo && numTwo > numThree) {
            System.out.printf("%nStrictly decreasing.");
        } 
        else if (numOne >= numTwo && numTwo >= numThree) {
            System.out.printf("%nDecreasing.");
        } 
        else {
            System.out.printf("%nUnordered");
        }
    }
}
