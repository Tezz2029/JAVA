// Program to Print Fibonacci Series upto the given Number

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = input.nextInt();

        fibonacciSeries(num);
    }

    public static void fibonacciSeries(int num){

        if (num < 0) {
            System.out.print("Invalid input. Please enter a non-negative number.");
            return;
        }

        if (num == 0) {
            System.out.print("0 ");
            return;
        }

        int first = 0, second = 1;
        System.out.print("0 1 ");

        while (first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }


    }
}
