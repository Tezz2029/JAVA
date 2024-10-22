// Program to find LCM of 2 numbers
import java.util.Scanner;

public class LCMTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number - ");
        int num1 = input.nextInt();

        System.out.print("Enter Second Number - ");
        int num2 = input.nextInt();


        int lcm = lcm(num1, num2);
        System.out.print("LCM of Two Numbers is - " + lcm);

    }

    public static int lcm(int num1, int num2){

        int i = 1;

        while (true){
            int factor = num1 * i;
            if(factor % num2 == 0){
                return factor;
            }
            i++;
        }
    }
}
