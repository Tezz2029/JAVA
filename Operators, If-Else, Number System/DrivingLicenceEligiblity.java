// Program to check if user is Eligible for the Driving Licence
import java.util.Scanner;

public class DrivingLicenceEligiblity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your Age - ");
        int Age = input.nextInt();

        if(Age >= 18){
            System.out.print("Eligible");
        }
        else {
            System.out.print("Not Eligible");
        }
    }
}
