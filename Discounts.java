import java.lang.System;
import java.util.Scanner;

public class Discounts {
    public static void main(String[] args) {
        double fee;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fee: ");
        fee = input.nextDouble();
        
        double discountPercentage;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter discountPercentage: ");
        discountPercentage = scan.nextDouble();

        double discount = (fee * discountPercentage) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
