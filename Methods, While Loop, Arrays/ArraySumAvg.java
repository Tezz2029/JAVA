// Program to calculate the sum of all the elements in the array and average of all the elements in the array
import java.util.Scanner;
import java.util.Arrays;

public class ArraySumAvg {
    public static void main(String[] args) {
        int[] array = arrayLoad();
        calSum(array);
        calAvg(array);
    }

    public static int[] arrayLoad(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the size of the array - ");
        int size = input.nextInt();
        int[] vals = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("Please enter element No. - " + (i+1) + ": ");
            vals[i] = input.nextInt();
            i++;
        }

        System.out.print("Array Elements - " + Arrays.toString(vals) + "\n");
        return vals;
    }

    public static void calSum(int[] array){
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.print("The Sum of the elements of the array is - " + sum + "\n");
        }

        public static void calAvg(int[] array){
        if (array.length == 0){
            System.out.print("The Array is Empty");
            return;
        }
        else{
            int sum = 0;
            for (int num : array){
                sum += num;
            }
            double avg = (double) sum / array.length;
            System.out.print("The Average of the elements of the array is - " + avg);
            }

        }
    }

