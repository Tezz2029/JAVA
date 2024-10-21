// Program to determine greatest number among three numbers
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Num1 - ");
        int Num1 = input.nextInt();
        System.out.print("Enter Num2 - ");
        int Num2 = input.nextInt();
        System.out.print("Enter Num3 - ");
        int Num3 = input.nextInt();

        if (Num1>=Num2 && Num1>=Num3){
            System.out.println("Num1 is the Greatest Number");
        }
        else if (Num2>=Num3) {
            System.out.println("Num2 is the Greatest Number");
        }
        else {
            System.out.println("Num3 is the Greatest Number");
        }
    }
}
