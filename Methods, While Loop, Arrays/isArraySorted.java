// Program to check if the array is sorted or not.

import java.util.Scanner;
import java.util.Arrays;

public class isArraySorted {
    public static void main(String[] args) {
        int array[] = loadArray();
        boolean isAsc = isAscending(array);
        boolean isDes = isDescending(array);

        if (isAsc){
            System.out.print("The Array is Sorted and is in Ascending Order");
        } else if (isDes) {
            System.out.print("The Array is Sorted and is in Descending Order");
        } else {
            System.out.print("The Array is NOT Sorted");
        }
    }


    public static int[] loadArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array - ");
        int alen = input.nextInt();
        int[] vals = new int[alen];
        int i = 0;
        while (i < alen) {
            System.out.print("Enter the value of " + (i + 1) + " element - ");
            vals[i] = input.nextInt();
            i++;
        }
        System.out.print("The array is - " + Arrays.toString(vals) + "\n");
        return vals;
    }

    public static boolean isAscending(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                return false;
            }
            i++;
        }

        return true;
    }

    public static boolean isDescending(int[] array){
        int i = 0;
        while (i < array.length - 1){
            if (array[i] < array[i + 1]){
                return false;
            }
            i++;
        }

        return true;
    }
}

