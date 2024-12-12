// Program to delete an Element from an array

import java.util.Scanner;
import java.util.Arrays;

public class arrayEleDelete {
    public static void main(String[] args) {
        int[] array = loadArray();
        int[] dArray = newArray(array);
        System.out.print("The Upsated Array is - " + Arrays.toString(dArray) + "\n");
    }

    public static int[] loadArray(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length of the Array - ");
        int aLen = input.nextInt();

        int[] vals = new int[aLen];
        int i = 0;
        while (i < aLen){
            System.out.print("Enter the value of" + (i+1) + " element - ");
            vals[i] = input.nextInt();
            i++;
        }
        System.out.println("Your entered Array is - " + Arrays.toString(vals) + "\n");
        return vals;
    }

    public static int[] newArray(int array[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Index of the Element that is to be Deleted - ");
        int dIndex = input.nextInt();

        if (dIndex < 0 || dIndex >= array.length){
            System.out.print("Please Enter a Valid Index");
        }

        int[] newArray = new int[array.length-1];

        int j = 0;
        for (int i = 0; i<array.length;i++){
            if (i != dIndex){
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}
