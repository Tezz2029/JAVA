// Program to find if the year is leap year or not
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Year - ");
        int Year = input.nextInt();

        if(Year % 400 == 0 || (Year % 4 == 0 && Year % 100 != 0)){
            System.out.println("Entered Year is a Leap Year");
        }
        else {
            System.out.println("Entered Year is not a Leap Year");
        }
    }

}
