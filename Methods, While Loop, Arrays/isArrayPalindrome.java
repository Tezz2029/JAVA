// Program to check if the entered Array is an Palindrome or not
import java.util.Scanner;
import java.util.Arrays;

public class isArrayPalindrome {
    public static void main(String[] args) {
        int[] array = loadArray();
        boolean aPalindrome = isPalindrome(array);

        if (aPalindrome){
            System.out.print("Entered Array is an Palindrome");
        }
        else {
            System.out.print("Entered Array is NOT a Palindrome");
        }
    }

    public static int[] loadArray(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the Array - ");
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

    public static boolean isPalindrome(int[] array){
        int j = array.length-1;
        int i = 0;

        while (i < j){
            if (array[i] != array[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
