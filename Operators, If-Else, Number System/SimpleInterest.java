// Program to find the Simple Interest

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal / amount you want to borrow - ");
        int Principal = input.nextInt();
        System.out.print("Enter the Time in years you will return the Borrowed money - ");
        int Time = input.nextInt();
        float RateOfInterest = 4.2f;

        float SimpleInterest = (Principal * RateOfInterest * Time) / 100;
        System.out.println("The Simple Interest is - " + SimpleInterest);

    }
}
