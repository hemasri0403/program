import java.lang.System;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num, reversed = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scan.nextInt();
                                                                                   
        if (num != 0) {
            int remainder = num % 10;
            reversed = num * 10 + remainder;
            num = num / 10;

        }

        System.out.println("Reverse Number" + reversed);

    }
}
