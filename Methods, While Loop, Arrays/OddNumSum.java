// Program to Print Sum of given "N" from 1 to N Odd Numbers
import java.util.Scanner;

class OddNumSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the last Number - ");
        int Num = input.nextInt();

        OddSum(Num);
    }

    public static void OddSum(int Num){
        int i = 1;
        int Sum = 0;

        while (i <= Num){
            if (i % 2 != 0){
                Sum += i;
            }
        i++;
        }

        System.out.println("The Sum of Odd Numbers upto" + Num + "is - " + Sum);

    }
}
