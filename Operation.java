import java.lang.System;
import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Enter number1: ");
        number1 = num.nextInt();
        System.out.print("Enter number2: ");
        number2 = num.nextInt();

        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ addition + " ,"
                + subtraction + ","
                + multiplication + "," + division + ".");
    }
}
