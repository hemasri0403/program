import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 5 integers: ");
        for (int i = 1; i <= 5; i++) {
            sum += scanner.nextInt();
        }

        double average = sum / 5.0;
        System.out.println("Average:" + average);
    }
}
