import java.util.Scanner;

public class ex6 {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      int x;
      int sum = 0;

      System.out.print("Enter x value: ");
      x = scan.nextInt();

      for (int i = 1; i <= x; i++) {
        sum += i;
      }

      System.out.println("Sum: " + sum);
    }
  }
}