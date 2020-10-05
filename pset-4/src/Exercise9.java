import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First Name  : ");
        String firstName = input.nextLine();
        System.out.print("Middle Name : ");
        String midName = input.nextLine();
        System.out.print("Last Name   : ");
        String lastName = input.nextLine();

        String initials = (firstName.charAt(0) + midName.substring(0, 1) + lastName.charAt(0)).toUpperCase();

        System.out.printf("%n" + initials + ".");
    }
}