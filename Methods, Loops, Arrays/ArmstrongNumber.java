// Program to check if the given Number is an Armstrong Number or not

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = input.nextInt();

        int armstrongNumber = isArmstrongNumber(num);
    }

    public static int isArmstrongNumber(int num){
        int originalNum = num;
        int digitNum = digitNum(num);
        int finalNumber = 0;

        while (num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber = finalNumber + power(lastDigit, digitNum);
        }

        if (finalNumber == originalNum){
            System.out.print("Your Entered Number " + originalNum + " is an Armstrong Number");
        }else {
            System.out.print("Your Entered Number " + originalNum + " is not an Armstrong Number");
        }
        return finalNumber;
    }

    public static int power(int num1, int num2){
        int result = 1;
        int i = 0;

        while (i < num2){
            result *= num1;
            i++;
        }
        return result;
    }

    public static int digitNum(int num){
        int digits = 0;

        while (num > 0){
            digits++;
            num /= 10;
        }
        return digits;
    }
}
