import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     
     System.out.print("Enter wage: ");
        double wage = input.nextDouble();
        
        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();
        
        if(wage < 0) {
        System.out.printf("%nYour wage must be greater than or equal to $0.00/hour."); 
        }      
       else if(hoursWorked < 0) { 
       System.out.printf("%nYour hours must be greater than or equal to 0.0."); 
       }       
       else {
            double payEarned = (hoursWorked <= 40) ? hoursWorked * wage : (40 * wage) + ((hoursWorked - 40) * wage * 1.5);
            System.out.printf("%nYou'll make $%,.2f this week.", payEarned);
            input.close();
        }
    }
}
