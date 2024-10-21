// Program to study Bitwise Operators
import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Num1 - ");
        int Num1 = input.nextInt();
        System.out.print("Enter Num2 - ");
        int Num2 = input.nextInt();

        input.nextLine();
        System.out.print("Enter the Bitwise operator Name - and/or/xor/complement/leftshift/rightshift - ");
        String BitwiseOperator = input.nextLine();
        int Result;
        int Shift;

        switch (BitwiseOperator){
            case "and":
                Result = Num1 & Num2;
                System.out.print("The bitwise AND Result is - " + Result);
                break;
            case "or":
                Result = Num1 | Num2;
                System.out.print("The bitwise OR Result is - " + Result);
                break;
            case "xor":
                Result = Num1 ^ Num2;
                System.out.print("The bitwise XOR Result is - " + Result);
                break;
            case "complement":
                Result = ~Num1;
                System.out.println("The Negation of Num1 is - " + Result);
                Result = ~Num2;
                System.out.println("The Negation of Num2 is - " + Result);
                break;
            case "leftshift":
                System.out.print("Enter No. of bits to shift - ");
                Shift = input.nextInt();
                Result = Num1 << Shift;
                System.out.println("Left shift of Num1 is - " + Result);
                Result = Num2 << Shift;
                System.out.println("Left shift of Num2 is - " + Result);
                break;
            case "rightshift":
                System.out.print("Enter No. of bits to shift - ");
                Shift = input.nextInt();
                Result = Num1 >> Shift;
                System.out.println("Right shift of Num1 is - " + Result);
                Result = Num2 >> Shift;
                System.out.println("Right shift of Num2 is - " + Result);
                break;

        }
    }
}
