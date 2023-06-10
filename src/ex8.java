import java.util.Scanner;

public class ex8 {
  public static void main(String[] args) {
    double pi = 3.14159;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the Radius:");
      double radius = sc.nextDouble();

      // double radius = 6.5;
      double perimeter = 2 * radius * pi;
      double area = radius * radius * pi;
      System.out.println("Perimeter: " + perimeter);
      System.out.println("Area: " + area);
    }

  }
}
