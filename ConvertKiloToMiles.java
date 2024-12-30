import java.lang.System;
import java.util.Scanner;

public class ConvertKiloToMiles {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter km: ");
        km = input.nextInt();
        double miles = km / 1.6;
        System.out.println("the total miles is" + miles + "for the given" + km + "km");
    }
}
