public class ex5 {
  public static void main(String[] args) {
    double result = (7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5);
    String hex = Double.toHexString(result);
    System.out.println(String.format("8 digit decision %.8f", result));
    System.out.println(String.format("16 digit decision %.16f", result));
    System.out.println(hex);
  }
}

// ! not completed
