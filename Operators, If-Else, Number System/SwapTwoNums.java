import java.util.Scanner;

public class SwapTwoNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp;

        System.out.print("Enter Num1 - ");
        int Num1 = input.nextInt();

        System.out.print("Enter Num2 - ");
        int Num2 = input.nextInt();

        temp = Num2;
        Num2 = Num1;
        Num1 = temp;

        System.out.println("Current value of Num1 is - " + Num1);
        System.out.println("Current value of Num2 is - " + Num2);
    }
}
