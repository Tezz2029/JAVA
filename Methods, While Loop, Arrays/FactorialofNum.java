// Program to Calculate the factorial of a given Number
import java.util.Scanner;

class FactorialofNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int Num = input.nextInt();

        NumFactorial(Num);
    }

    public static void NumFactorial(int Num){
        int i = 1;
        int Result = 1;

        while (i <= Num){
            Result *= i;
            i++;
        }
        System.out.print("The Factorial of given Number is - " + Result);
    }
}
