import java.util.Scanner;
import java.lang.System;
public class StopWatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("press enter start");
scan.nextLine();
  long start= System.currentTimeMillis();

 System.out.println("press enter start");
scan.nextLine();
  long end = System.currentTimeMillis();

  long elapsedTime =  end - start;
  double totalElapsedTimeSecounds = elapsedTime/1000.0;

  System.out.println("total secounds"+totalElapsedTimeSecounds);

    }
}
