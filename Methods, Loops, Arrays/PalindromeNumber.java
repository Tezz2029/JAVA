// Program to identify if the given Number is a Palindrome Number or not

import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = input.nextInt();

        int palindromeNumber = isPalindrome(num);
    }

    public static int isPalindrome(int num){
        int reverseNum = reverseNum(num);

        if (num == reverseNum){
            System.out.print("Your Entered Number " + num + " is a Palindrome");
        }else {
            System.out.print("Your Entered Number " + num + " is not a Palindrome");
        }

        return reverseNum;
    }

    public static int reverseNum(int num){
        int newNum = 0;

        while (num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
