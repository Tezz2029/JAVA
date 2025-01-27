// Searching an Element in an 2D Array
import java.util.Scanner;
import java.util.Arrays;

public class search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] array = loadArray();
        System.out.println("Your Entered Array is - ");
        print2DArray(array);

        System.out.print("Enter the value you want to search - ");
        int target = input.nextInt();

        int[] result = search2DArray(array, target);
        if (result != null){
            System.out.print("Your Entered value - " + target + ", is found at index - [" + result[0] + "] [" + result[1] + "]");
        }else {
            System.out.print("Your Entered value - " + target + ", does not exist");
        }
    }

    public static int[][] loadArray(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows - ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns - ");
        int cols = input.nextInt();
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print("Enter the Element [" + i + "] [" + j + "] - ");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    public static void print2DArray(int[][] array){
        for (int[] row : array){
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[] search2DArray(int[][] array, int target){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

}
