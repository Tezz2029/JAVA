// Program to find sum of digits of an integer
import java.util.Scanner;

public class SumofIntDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int Num = input.nextInt();

        int Sum = DigitsSum(Num);
        System.out.println("The sum of digits of the integer is = " + Sum);
    }

    public static int DigitsSum(int Num){

        int Sum = 0;
        while (Num > 0) {
            Sum += Num % 10;
            Num /= 10;
        }
    return Sum;
    }
}
