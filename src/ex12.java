public class ex12 {
  public static void main(String[] args) {
    double distanceKm = 24 * 1.6;
    double timeMinutes = 35 / 60 + 40 + 60;

    double speedPerMinutes = distanceKm / timeMinutes;
    double speedPerHour = speedPerMinutes * 60;
    System.out.println(speedPerHour + "Km/h");
  }
}
