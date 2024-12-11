// Program to find the occurrence of the element in an array
import java.util.Scanner;
import java.util.Arrays;

public class occurrenceInArray {
    public static void main(String[] args) {
        int[] array = loadArray();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check its occurrence: ");
        int num = input.nextInt();
        int elementOcc = occCount(array, num);
        System.out.println("The number " + num + " occurs " + elementOcc + " times in the array.");
    }

    public static int[] loadArray(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size/length of the Array - ");
        int alength = input.nextInt();
        int[] vals = new int[alength];
        int i = 0;
        while (i < alength){
            System.out.print("Enter the value of the element " + (i+1) + "- ");
            vals[i] = input.nextInt();
            i++;
        }
        System.out.println("The array is - " + Arrays.toString(vals) + "\n");
        return vals;
    }

    public static int occCount(int[] array, int num){
        int count = 0;
        int i = 0;
        while (i < array.length){
            if (array[i] == num){
                count += 1;
            }
            i++;
        }
        return count;
    }
}
