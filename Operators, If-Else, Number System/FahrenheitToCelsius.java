// Program to convert Fahrenheit to Celsius
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Temperature in Fahrenheit - ");
        float Ftemp = input.nextFloat();
        float Ctemp = (Ftemp - 32) * 5 / 9;
        System.out.print("Temperature in Celsius is - " + Ctemp + "C");
    }
}
