// Program to Reverse an Array

import java.util.Scanner;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] array = loadArray();
        int[] newArray = rArray(array);
    }

    public static int[] loadArray(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length of an Array - ");
        int alen = input.nextInt();
        int[] vals = new int[alen];

        int i = 0;
        while (i < alen){
            System.out.print("Enter the value of " + (i+1) + " element - ");
            vals[i] = input.nextInt();
            i++;
        }
        System.out.print("Your Entered Array is - " + Arrays.toString(vals) + "\n");
        return vals;
    }

    public static int[] rArray(int[] array){
        Scanner input = new Scanner(System.in);

        int j = array.length-1;
        int[] rArray = new int[array.length];

        int i = 0;
        while (i< array.length){
            rArray[i] = array[j];
            j--;
            i++;
        }
        System.out.print("The Reversed Array is - " + Arrays.toString(rArray) + "\n");
        return rArray;
    }
}
