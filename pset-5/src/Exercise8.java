import java.util.Scanner;

        public class Exercise8 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("Enter a temperature: ");
                int temp = in.nextInt();
                String matter = in.next();

                if (matter.equals("F") || matter.equals("f")) {
                    if (temp <= 32) {
                        System.out.println(" ");
                        System.out.println("Solid.");
                    } 
                    else if (temp < 212) {
                        System.out.println(" ");
                        System.out.println("Liquid.");
                    } 
                    else {
                        System.out.println(" ");
                        System.out.println("Gas.");
                    }
                } 
                else if (matter.equals("C") || matter.equals("c")){
                    if (temp <= 0) {
                        System.out.println(" ");
                        System.out.println("Solid.");
                    } 
                    else if (temp < 100) {
                        System.out.println(" ");
                        System.out.println("Liquid.");
                    } e
                    lse {
                        System.out.println(" ");
                        System.out.println("Gas.");
                    }
                } 
                else {
                    System.out.println(" ");
                    System.out.println("That's not a valid scale.");
                }

                in.close();
            }
        }
