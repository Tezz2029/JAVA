// Program to merge 2 sorted array in a way such that the new merged array is also sorted

import java.util.Scanner;
import java.util.Arrays;

public class mergeTwoArrays {
    public static void main(String[] args) {
        System.out.println("Enter Array 1 - ");
        int[] array1 = loadArray();
        System.out.println("Enter Array 2 - ");
        int[] array2 = loadArray();

        int[] mergedArray = mArray(array1, array2);
        System.out.print("The Final merged array is - " + Arrays.toString(mergedArray));
    }

    public static int[] loadArray(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array - ");
        int alen = input.nextInt();
        int[] vals = new int[alen];

        int i = 0;
        while (i<alen){
            System.out.print("Enter the value of " + (i+1) + " element - ");
            vals[i] = input.nextInt();
            i++;
        }
        System.out.println("Your entered array is - " + Arrays.toString(vals) + "\n");
        return vals;
    }

    public static int[] mArray(int[] array1, int[] array2){
        int i = 0;
        int j = 0;
        int k = 0;

        int[] mArray = new int[array1.length + array2.length];

        while (i < array1.length && j < array2.length){
            if (array1[i] < array2[j]){
                mArray[k] = array1[i];
                i++;
            }
            else{
                mArray[k] = array2[j];
                j++;
            }
            k++;
        }

        while (i < array1.length) {
            mArray[k] = array1[i];
            i++;
            k++;
        }

        // Copy remaining elements of array2, if any
        while (j < array2.length) {
            mArray[k] = array2[j];
            j++;
            k++;
        }
        return mArray;
    }
}
