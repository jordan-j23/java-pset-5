import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Text : ");
        String text = input.nextLine();
        input.close();
        int l = text.length();
        int midpoint = (l / 2);
        String backwardsText = text.substring(midpoint, l).concat(text.substring(0, midpoint)).toUpperCase();
        System.out.printf("%n" + backwardsText + ".");
    }
}