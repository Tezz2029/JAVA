// Program to find the Area of a Triangle

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("**** Program to Find area of Triangle ****");

        System.out.print("Enter Base of a Triangle in cm - ");
        int Base = input.nextInt();
        System.out.print("Enter the Height / Perpendicular Height of Triangle in cm - ");
        int Height = input.nextInt();

        double AreaOfTriangle = 0.5 * Base * Height;
        System.out.println("Area of the Triangle is - " + AreaOfTriangle + "cm^2");
    }
}
