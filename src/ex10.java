public class ex10 {
  public static void main(String[] args) {
    int distanceKm = 15;
    double times = 50.5;

    double distanceMile = distanceKm / 1.6;
    double milesPerMinute = distanceMile / times;
    double milesPerHours = milesPerMinute * 60;
    System.out.println(milesPerHours + " miles/hours");
  }
}
