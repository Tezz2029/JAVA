// Program to check if Entered Number is Even or Odd using Bitwise AND Operator
import java.util.Scanner;

public class BitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int Num = input.nextInt();
        int Reult = Num & 1;

        if (Reult == 1){
            System.out.print("The Entered Number is Odd");
        }
        else {
            System.out.print("Entered Number is Even");
        }
    }
}
