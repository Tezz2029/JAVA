// Program to find the Compound Interest

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal / amount you want to borrow - ");
        int Principal = input.nextInt();
        System.out.print("Enter the Time in years you will return the Borrowed money - ");
        int Time = input.nextInt();
        float RateOfInterest = 4.2f;

        double CompoundInterest = Principal * Math.pow((1 + RateOfInterest / 100), Time);
        System.out.print("The Compound Interest is - " + CompoundInterest);
    }
}