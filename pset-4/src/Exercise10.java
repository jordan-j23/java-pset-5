import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your favorite city? ");

        String city = input.nextLine();
        int leng = city.length();

        String upperCity = city.toUpperCase();
        String lowerCity = city.toLowerCase();


        System.out.printf("%nText   : " + city + "%nLength : " + leng + "%nUpper  : " + upperCity + "%nLower  : " + lowerCity);
    }
}
