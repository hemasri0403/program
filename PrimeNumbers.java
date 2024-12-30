import java.lang.System;
import java.util.Scanner;

class PrimeNumbers {
    public static void main(String[] args) {
        int i, num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Value");
        num = scan.nextInt();

        for (i = 2; i <= num; i++) {
            if (num % i == 0 && num % 1 == 0) {
                System.out.println("Prime Number" + i);
            } else {
                System.out.println("Not PrimeNumber" + i);
            }

        }
    }
}
