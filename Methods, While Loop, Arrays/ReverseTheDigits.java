// Program to Reverse the Digits of the given Number

import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = input.nextInt();

        int reverseNum = reverseNum(num);
        System.out.print("The Reverse of the given Number is - " + reverseNum);
    }

    public static int reverseNum(int num){

        int newNum = 0;

        while (num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }

        return newNum;    }
}
