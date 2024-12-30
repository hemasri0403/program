import java.lang.System;

public class PreAndPostIncreament {
    public static void main(String[] args) {
        int num = 5;

        System.out.println("Post-Increment: " + num++);
        System.out.println("Value after Post-Increment: " + num);

        System.out.println("Pre-Increment: " + ++num);
    }
}
