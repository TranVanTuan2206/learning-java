import java.util.Scanner;

public class ex9 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter Width:");
      double width = sc.nextDouble();
      System.out.println("Enter Height:");
      double height = sc.nextDouble();

      System.out.println("Perimeter is: " + (2 * (width + height)));
      System.out.println("Area is: " + (width * height));
    }
  }
}
