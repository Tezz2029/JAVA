// Program to find the Minimum and Maximum element of the array
import java.util.Scanner;
import java.util.Arrays;

public class arrayMinMax {
    public static void main(String[] args) {
        int[] array = loadArray();
        int maxVal = maxEle(array);
        System.out.print("The maximum element in the array is - " + maxVal + "\n");
        int minVal = minEle(array);
        System.out.print("The minimum element in the array is - " + minVal);
    }

    public static int[] loadArray(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length of the array - ");
        int aSize = input.nextInt();
        int[] vals = new int[aSize];
        int i = 0;

        while (i < aSize){
            System.out.print("Enter the value of " + (i +1) + " element - ");
            vals[i] = input.nextInt();
            i++;
        }
        System.out.print("The array is - " + Arrays.toString(vals) + "\n");
        return vals;
    }

    public static int maxEle(int[] array){
        int max = array[0];

        for (int num : array){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    public static int minEle(int[] array){
        int min = array[0];

        for (int num : array){
            if (num < min){
                min = num;
            }
        }
        return min;
    }
}
