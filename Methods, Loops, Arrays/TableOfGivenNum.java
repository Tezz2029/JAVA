// Program to print the Table of given number

import java.util.Scanner;

class TableOfGivenNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int Num = input.nextInt();

        PrintTable(Num);
    }

    public static void PrintTable(int Num){
        int i = 1;
        int Table;

        while (i <= 10) {
            Table = Num * i;

            System.out.println(Num + "X" + i + "=" + Table);
            i++;
        }
    }
}
