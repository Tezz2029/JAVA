// Program to check if the entered number is Prime or not

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = input.nextInt();
        int prime = isPrime(num);
    }

    public static int isPrime(int num){
        int i = 2;
        int count = 0;

        while(i <= num){
            if(num % i == 0){
                count++;
            }
            i++;
        }
        if(count >= 2){
            System.out.print("Entered Number is not a Prime Number");
        }else{
            System.out.print("Entered Number is a Prime Number");
        }

        return num;
    }
}
