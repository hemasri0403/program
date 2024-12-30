import java.lang.System;

 class Fibonacci {
    public static void main(String[] args) {
        int i;
        int num1 = 0;
        int num2 = 1;

        System.out.println("Fibonacci series");
        for (i = 0; i <= 10; i++) {
            
            System.out.println(num1);
            int list = num1 + num2;
            num1 = num2;
            num2 = list;


        }

    }
}
