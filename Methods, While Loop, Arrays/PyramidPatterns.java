// Program to print the Pyramid patters (Left Hand, Right Hand, and Reverse)

import java.util.Scanner;
public class PyramidPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows - ");
        int rows = input.nextInt();

        leftHalfPyramid(rows);
        brline(rows);

        reverseLeftHalfPyramid(rows);
        brline(rows);

        rightHalfPyramid(rows);
        brline(rows);

        reverseRightHalfPyramid(rows);
        brline(rows);


    }

    public static void leftHalfPyramid(int rows){
        System.out.println("Left Half Pyramid -");

        int i = 1;
        while (i <= rows){
            int space = rows - i;

            while (space > 0){
                System.out.print(" ");
                space--;
            }

            int j = 1;
            while (j <= i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i ++;
        }
    }

    public static void reverseLeftHalfPyramid(int rows){
        System.out.println("Reverse Left Half Pyramid -");

        int i = rows;
        while (i >= 1){
            int space = rows - i;

            while (space > 0){
                System.out.print(" ");
                space--;
            }

            int j = 1;
            while (j <= i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void rightHalfPyramid(int rows){
        System.out.println("Right Half Pyramid -");

        int i = 1;
        while (i <= rows){
            int j = 1;
            while (j <= i){
                if (j < i) {
                    System.out.print("* ");
                } else {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void reverseRightHalfPyramid(int rows){
        System.out.println("Reverse Right Half Pyramid -");

        int i = rows;
        while (i >= 1){
            int j = 1;
            while (j <= i){
                if (j < i) {
                    System.out.print("* ");
                } else {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void brline(int rows){
        int count = 1;
        int rowsCount = rows + 10;
        while (count <= rowsCount) {
            System.out.print("#");
            count++;
        }
        System.out.println();
    }

}
